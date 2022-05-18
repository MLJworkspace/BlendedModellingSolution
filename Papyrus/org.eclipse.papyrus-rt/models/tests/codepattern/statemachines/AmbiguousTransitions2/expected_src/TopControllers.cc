
#include "TopControllers.hh"

#include "Top.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtcommsport.hh"
#include "umlrtcommsportfarend.hh"
#include "umlrtcontroller.hh"
#include "umlrtslot.hh"
#include <cstddef>


static UMLRTController DefaultController_( "DefaultController" );

UMLRTController * DefaultController = &DefaultController_;

static UMLRTCommsPortFarEnd borderfarEndList_Top[] = 
{
    {
        0,
        NULL
    },
    {
        0,
        NULL
    }
};

UMLRTCommsPort borderports_Top[] = 
{
    {
        &Top,
        Capsule_Top::borderport_protocol1,
        &Top_slots[InstId_Top],
        1,
        borderfarEndList_Top,
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true
    },
    {
        &Top,
        Capsule_Top::borderport_protocol2,
        &Top_slots[InstId_Top],
        1,
        &borderfarEndList_Top[1],
        NULL,
        NULL,
        "",
        true,
        true,
        true,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        true
    }
};

static const UMLRTCommsPort * borderports_Top_ptrs[] = 
{
    &borderports_Top[0],
    &borderports_Top[1]
};

static Capsule_Top top( &Top, &Top_slots[InstId_Top], borderports_Top_ptrs, NULL, true );

UMLRTSlot Top_slots[] = 
{
    {
        "Top",
        0,
        &Top,
        NULL,
        0,
        &top,
        &DefaultController_,
        0,
        NULL,
        2,
        borderports_Top,
        NULL,
        true,
        false
    }
};

