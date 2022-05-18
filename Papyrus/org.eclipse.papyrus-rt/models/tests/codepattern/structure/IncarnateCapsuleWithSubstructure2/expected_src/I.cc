
#include "I.hh"

#include <cstddef>
#include "umlrtcapsuleclass.hh"
#include "umlrtcommsportrole.hh"
#include "umlrtframeservice.hh"
#include "umlrtslot.hh"
class UMLRTRtsInterface;
struct UMLRTCommsPort;

Capsule_I::Capsule_I( const UMLRTCapsuleClass * cd, UMLRTSlot * st, const UMLRTCommsPort * * border, const UMLRTCommsPort * * internal, bool isStat )
: UMLRTCapsule( NULL, cd, st, border, internal, isStat )
, protocol1( borderPorts[borderport_protocol1] )
, protocol3( borderPorts[borderport_protocol3] )
{
}






void Capsule_I::bindPort( bool isBorder, int portId, int index )
{
    if( isBorder )
        switch( portId )
        {
        case borderport_protocol1:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_protocol1, index, true );
            break;
        case borderport_protocol3:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_protocol3, index, true );
            break;
        }
}

void Capsule_I::unbindPort( bool isBorder, int portId, int index )
{
    if( isBorder )
        switch( portId )
        {
        case borderport_protocol1:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_protocol1, index, false );
            UMLRTFrameService::disconnectPort( borderPorts[borderport_protocol1], index );
            break;
        case borderport_protocol3:
            UMLRTFrameService::sendBoundUnbound( borderPorts, borderport_protocol3, index, false );
            UMLRTFrameService::disconnectPort( borderPorts[borderport_protocol3], index );
            break;
        }
}

void Capsule_I::initialize( const UMLRTMessage & msg )
{
}

void Capsule_I::inject( const UMLRTMessage & msg )
{
}


static const UMLRTCommsPortRole portroles_border[] = 
{
    {
        Capsule_I::port_protocol3,
        "Protocol3",
        "protocol3",
        "",
        1,
        true,
        false,
        false,
        false,
        false,
        false,
        true
    },
    {
        Capsule_I::port_protocol1,
        "Protocol1",
        "protocol1",
        "",
        1,
        true,
        true,
        false,
        false,
        false,
        false,
        true
    }
};

static void instantiate_I( const UMLRTRtsInterface * rts, UMLRTSlot * slot, const UMLRTCommsPort * * borderPorts )
{
    slot->capsule = new Capsule_I( &I, slot, borderPorts, NULL, false );
}

const UMLRTCapsuleClass I = 
{
    "I",
    NULL,
    instantiate_I,
    0,
    NULL,
    2,
    portroles_border,
    0,
    NULL
};

