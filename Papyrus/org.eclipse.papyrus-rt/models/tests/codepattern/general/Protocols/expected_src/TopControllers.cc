
#include "TopControllers.hh"

#include "Capsule1.hh"
#include "Top.hh"
#include "umlrtcapsuleclass.hh"
#include "umlrtcapsulepart.hh"
#include "umlrtcommsport.hh"
#include "umlrtcommsportfarend.hh"
#include "umlrtcontroller.hh"
#include "umlrtslot.hh"
#include <cstddef>


static UMLRTController DefaultController_( "DefaultController" );

UMLRTController * DefaultController = &DefaultController_;

static UMLRTCommsPortFarEnd internalfarEndList_Top[] = 
{
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p1a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p10a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p10b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p1b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p2a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p2b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p3a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p3b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p4a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p4b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p5a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p5b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p6a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p6b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p7a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p7b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p8a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p8b]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p9a]
    },
    {
        0,
        &borderports_Top_capsule1[Capsule_Capsule1::borderport_p9b]
    }
};

UMLRTCommsPort internalports_Top[] = 
{
    {
        &Top,
        Capsule_Top::internalport_protocol1,
        &Top_slots[InstId_Top],
        1,
        internalfarEndList_Top,
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol10,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[1],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol102,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[2],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol12,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[3],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol2,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[4],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol22,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[5],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol3,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[6],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol32,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[7],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol4,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[8],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol42,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[9],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol5,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[10],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol52,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[11],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol6,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[12],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol62,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[13],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol7,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[14],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol72,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[15],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol8,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[16],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol82,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[17],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol9,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[18],
        NULL,
        NULL,
        "",
        true,
        false,
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
        Capsule_Top::internalport_protocol92,
        &Top_slots[InstId_Top],
        1,
        &internalfarEndList_Top[19],
        NULL,
        NULL,
        "",
        true,
        false,
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

static const UMLRTCommsPort * internalports_Top_ptrs[] = 
{
    &internalports_Top[0],
    &internalports_Top[1],
    &internalports_Top[2],
    &internalports_Top[3],
    &internalports_Top[4],
    &internalports_Top[5],
    &internalports_Top[6],
    &internalports_Top[7],
    &internalports_Top[8],
    &internalports_Top[9],
    &internalports_Top[10],
    &internalports_Top[11],
    &internalports_Top[12],
    &internalports_Top[13],
    &internalports_Top[14],
    &internalports_Top[15],
    &internalports_Top[16],
    &internalports_Top[17],
    &internalports_Top[18],
    &internalports_Top[19]
};

static Capsule_Top top( &Top, &Top_slots[InstId_Top], NULL, internalports_Top_ptrs, true );

static UMLRTSlot * slots_Top[] = 
{
    &Top_slots[InstId_Top_capsule1]
};

static UMLRTCapsulePart parts_Top[] = 
{
    {
        &Top,
        Capsule_Top::part_capsule1,
        1,
        &slots_Top[0]
    }
};

static UMLRTCommsPortFarEnd borderfarEndList_Top_capsule1[] = 
{
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol10]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol102]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol1]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol12]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol2]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol22]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol3]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol32]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol4]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol42]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol5]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol52]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol6]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol62]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol7]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol72]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol8]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol82]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol9]
    },
    {
        0,
        &internalports_Top[Capsule_Top::internalport_protocol92]
    }
};

UMLRTCommsPort borderports_Top_capsule1[] = 
{
    {
        &Capsule1,
        Capsule_Capsule1::borderport_p1a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[2],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p10a,
        &Top_slots[InstId_Top_capsule1],
        1,
        borderfarEndList_Top_capsule1,
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
        &Capsule1,
        Capsule_Capsule1::borderport_p10b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[1],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p1b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[3],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p2a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[4],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p2b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[5],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p3a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[6],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p3b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[7],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p4a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[8],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p4b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[9],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p5a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[10],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p5b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[11],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p6a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[12],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p6b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[13],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p7a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[14],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p7b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[15],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p8a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[16],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p8b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[17],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p9a,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[18],
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
        &Capsule1,
        Capsule_Capsule1::borderport_p9b,
        &Top_slots[InstId_Top_capsule1],
        1,
        &borderfarEndList_Top_capsule1[19],
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

static const UMLRTCommsPort * borderports_Top_capsule1_ptrs[] = 
{
    &borderports_Top_capsule1[0],
    &borderports_Top_capsule1[1],
    &borderports_Top_capsule1[2],
    &borderports_Top_capsule1[3],
    &borderports_Top_capsule1[4],
    &borderports_Top_capsule1[5],
    &borderports_Top_capsule1[6],
    &borderports_Top_capsule1[7],
    &borderports_Top_capsule1[8],
    &borderports_Top_capsule1[9],
    &borderports_Top_capsule1[10],
    &borderports_Top_capsule1[11],
    &borderports_Top_capsule1[12],
    &borderports_Top_capsule1[13],
    &borderports_Top_capsule1[14],
    &borderports_Top_capsule1[15],
    &borderports_Top_capsule1[16],
    &borderports_Top_capsule1[17],
    &borderports_Top_capsule1[18],
    &borderports_Top_capsule1[19]
};

static Capsule_Capsule1 top_capsule1( &Capsule1, &Top_slots[InstId_Top_capsule1], borderports_Top_capsule1_ptrs, NULL, true );

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
        1,
        parts_Top,
        0,
        NULL,
        NULL,
        true,
        false
    },
    {
        "Top.capsule1",
        0,
        &Capsule1,
        &Top,
        Capsule_Top::part_capsule1,
        &top_capsule1,
        &DefaultController_,
        0,
        NULL,
        20,
        borderports_Top_capsule1,
        NULL,
        true,
        false
    }
};
