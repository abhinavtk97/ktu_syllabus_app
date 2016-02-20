package com.saulmm.material.activities;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.saulmm.material.R;

public class TransitionFirstActivity extends Activity {


    private View mFabButton;
    private View mHeader;

    String m11,m12,m13,m21,m22,m23,m31,m32,m33,m41,m42,m43,m51,m52,m53,m61,m62,m63;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_first);

        mFabButton = findViewById(R.id.fab_button);
        mHeader = findViewById(R.id.activity_transition_header);



        Slide slideExitTransition = new Slide(Gravity.BOTTOM);
        slideExitTransition.excludeTarget(android.R.id.navigationBarBackground, true);
        slideExitTransition.excludeTarget(android.R.id.statusBarBackground, true);
        slideExitTransition.excludeTarget(R.id.activity_transition_header, true);
        getWindow().setExitTransition(slideExitTransition);
    }



    public void onFabPressed(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
            TransitionSecondActivity.class);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
            TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }
    public void IntCivil(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="General   introduction   to   Civil   Engineering   –   History   of   Civil Engineering   -   Relevance   of   Civil   Engineering   in   the   overall infrastructural development of the country.Types and  classification of structures – buildings, towers, chimneys,\n" +
                "bridges,  dams,  retaining  walls,  water  tanks,  silos,  roads,  railways, runways and pipelines (Brief description only) Definition and types of buildings as per National Building Code of India (brief description only). Selection of site – Components of a building and their functions –Setting out of a building.";
        m12="";
        m13="";
        m21="Stones: Classification of stones – Qualities of good building stones – Quarrying – Dressing –  Tests – Specifications – Uses of common building stones. Bricks: Composition of good brick earth – Classification – Qualities of good bricks – Field and laboratory tests – Specifications. Tiles:   Classification   –   Manufacture   –   Properties   –   Tests   – Specifications\n";

        m22="";
        m23="";
        m31="Cement:  Basic  Ingredients  –  Manufacturing  process  –  Grades  –Properties – Tests – Specifications. Aggregates: Fine and coarse aggregate – Properties – Uses – Tests.Cement Mortar: Types and preparation.\n" ;

        m32="";
        m33="";
        m41="Stone Masonry: Types – Details of Ashlar, Random Rubble, Coarse Rubble and Dry Rubble Masonry. Brick Masonry: Types – Bond – Introduction to all types of bonds – English bond in detail (1, 1½ and 2 brick walls) – Comparison of stone and brick masonry.\n" ;

        m42="";
        m43="";
        m51="Timber: Properties – Uses – Classification – Seasoning – Defects –Preservation – Tests; Hard board and Particle board – Manufacture and useSteel: Structural steel and steel as reinforcement – Types – Properties– Uses – Market forms.\n";

        m52="";
        m53="";
        m61="Floors and Flooring materials: Different types and selection of floors and floor coverings. Roofs and roof coverings: Different types of roofs – Suitability – Types and selection of roofing materials.\n" +
                "\n" +
                "Hence the B.tech Syllabus for KTU .\n";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }
    public void IntLc(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Colour coding.Inductors and Transformers: types, specifications, Principle of working.Electro mechanical components: relays and contactors.\n" ;

        m12="";
        m13="";
        m21="Diodes: Intrinsic and extrinsic semiconductors, PN junction diode, barrierpotential, V-I characteristics, Effect of temperature. Equivalent circuit of a diode. Piece wise linear model.Specification parameters of diodes and numbering.Zener diode, Varactor diodes, characteristics, working principle of LED,photo diode, solar cell.\n";

        m22="";
        m23="";
        m31="Bipolar  Junction  Transistors:  Structure,  typical  doping,  Principle  of operation, concept of different configurations. Detailed study of input and output characteristics of common base and common emitter configuration, current gain, comparison of three configurations.Concept   of   load   line   and   operating  point.   Need   for   biasing   and stabilization, voltage divider biasing, Transistor as amplifier, switch, RC coupled amplifier and frequency response Specification parameters of transistors and type numbering\n";

        m32="";
        m33="";
        m41="Junction   Field   Effect   Transistors:  Structure,   principle   of   operation,characteristics, comparison with BJT.\n" +
                "MOSFET:  Structure,   principle   of   operation   of   Enhancement   type MOSFET, Current voltage characteristics, Depletion-type MOSFET. Principle of operation of Photo transistor, UJT, SCR.\n";

        m42="";
        m43="";
        m51="Diode  circuits  and  power  supplies:  Series  and  parallel  diode  circuits,Clippers, Clampers, Voltage multipliers\n" +
                "Half-wave and full wave (including bridge) rectifiers,  Derivation of Vrms, Vdc, ripple factor,   peak inverse voltage, rectification efficiency in each case,  capacitor  filter,    working  and  design  of  a  simple  zener  voltage regulator.Block diagram description of a DC Power supply, Principle of SMPS\n" ;

        m52="";
        m53="";
        m61="Electronic Measurements and measuring Instruments. Generalized  performance  parameters  of  instruments:  error,  accuracy,\n" +
                "sensitivity, precision and resolution. Principle and block diagram of analog and digital multimeter, Block diagram of CRO, Measurements using CRO, Lissajous patterns, Principle and block diagram of DSO, function generator. Testing of Electronic components.\n" ;

        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void IntSus(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Sustainability-    Introduction,    Need    for    sustainability,    Concept    of sustainability, social, environmental and economic sustainability concepts.Sustainable development, Engineering for sustainable development, Threats for sustainability, Low Impact development techniques. Environmental ethics, Environmental education, multilateral environmental agreements  and  Protocols –Environmental legislations in India- Water act, Air act\n" +
                "\n" +
                "Examples for project work:\n" +
                "1. Identifying/assessment of sustainability in your neighbourhood in education, housing, water resources, energy resources, food supplies, land use, environmental protection etc.\n" +
                "2. Identify the threats for sustainability in any selected area and explore solutions for the same\n" +
                "3. Suggest some LID activities that can be adopted";
        m12="";
        m13="";
        m21="Tools for sustainability, Life cycle assessment, procedure for LCA, casestudies:ISO 14000, bio mimicking, responsibility of industries, industrial ecology,industrial symbiosis, cleaner production, clean development mechanism. Environment    Impact    Assessment,    Procedures    of    EIA    in    India, Environmental auditing, Case studies in environmental sustainability Examples for project work:\n" +
                "1. Conducting LCA of products (eg. Aluminium cans, PVC bottles, cars etc. or activities (Comparison of land filling and open burning)\n" +
                "2. Conducting an EIA study of a small project (eg. Construction of a building)\n" ;

        m22="";
        m23="";
        m31="Basic concepts of sustainable habitat, Green buildings, green materials for building  construction,  material  selection  for  sustainable  design,  green building certification.Methods for increasing energy efficiency of buildings, Sustainable cities,\n" +
                "Sustainable transportation, Case studies in sustainable engineering.\n" +
                "Examples for project work:\n" +
                "1. Consider the design of a sustainable building for your campus\n" +
                "2. Explore the different methods that can be adopted for maintaining a sustainable transport system in your city\n" ;

        m32="";
        m33="";
        m41="Air pollution- sources of air pollution, vehicular and industrial, types of air pollutants, Effects of air pollutants.\n" +
                "Global environmental issues, Resource degradation, Desertification, wetland reclamation, Climate change, Ozone layer depletion, Carbon credits and carbon trading, carbon foot print.\n" +
                "Examples for project work:\n" +
                "1. Collect details for instances of climate change in your locality.\n" +
                "2. Find out the carbon credits you can gain by using a sustainable transport system (travelling in a cycle or car pooling from college to home)\n" ;

        m42="";
        m43="";
        m51="Energy sources: Basic concepts-Conventional and non-conventional, solar energy, solar thermal systems, solar photo voltaic systems, Fuel cell. Wind energy, Small hydro plants, Biomass: types of biogas plants, bio fuels,\n" +
                "Energy derived from oceans, tides and waves, Geothermal energy. Energy conservation, Integration of alternate energy sources\n" +
                "Examples for project work:\n" +
                "Design a photovoltaic system for a house.Find out the energy savings that can be achieved by the installation of a solar water heater\n" +
                "Conduct a feasibility study for the installation of wind mills in Kerala\n" ;

        m52="";
        m53="";
        m61="Water pollutants- sources, persistent pollutants, Rain water harvesting, water quality standards, sustainable wastewater treatment methods, Energy from wastewater. Solid waste - sources, effects of solid waste pollutants, leachate, Hazardous\n" +
                "wastes, e wastes, plastic wastes, Radioactive wastes, Zero waste concept, 3R concept, waste to energy concept.\n" +
                "Examples for project work:\n" +
                "Design of biogas digesters for a small community\n" +
                "Advantages of installing rain water harvesting systems in  campus\n" +
                "Assessing the pollution status of a small area\n" +
                "Programmes for enhancing public environmental awareness\n" +
                "Observe a pond nearby and think about the different measures that can be adopted for its conservation\n" ;

        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void IntChem(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Introduction to Chemical Engineering: history of Chemical Engineering,role of Chemical Engineering– a broad overview; chemical industries in India; introduction to Chemical Engineering profession; introduction to chemical plant operation; process development and process design.\n" ;

        m12="";
        m13="";
        m21="Basic concepts: units and dimensions, systems of units, conversion and conversion factors of units, concept of mole, weight percent, mole percent, normality, molarity, molality, vapor pressure, partial pressure, concept of ideal gas and equations of state.\n" ;

        m22="";
        m23="";
        m31="Overview of unit operations such as distillation, evaporation, absorption,adsorption, extraction, crystallization, drying, leaching, size separation and size reduction. Overview of unit processes like saponification, polymerization, biodiesel formation and hydrogenation.\n" ;

        m32="";
        m33="";
        m41="Modes of heat transfer-principles of conduction, convection and radiation,heat exchangers. Fluid flow- laminar and turbulent flow. Introduction to transportation of fluids.Classification  of  chemical  reactions,  order  of  reaction,  rate  equation, Arrhenius equation, conversion and yield, batch reactor, mixed reactor and plug flow reactor.\n" ;

        m42="";
        m43="";
        m51="Block diagram, process flow diagram for DCDA process for Sulphuric acid manufacture, basic concepts of P&I diagram. Introduction to process instrumentation and  control:  common methodologies of  measurements, measuring instruments: thermocouple, venturimeter, U-tube manometer, elements of feedback control loop, introduction to control of a distillation column.\n" ;

        m52="";
        m53="";
        m61="Introduction to safety in chemical process industries – basic concepts, Case study: Bhopal gas tragedy. Introduction to Environmental Engineering - basic concepts, Typical wastewater, air and solid waste management system.Case study: Effect of Aerial Spraying of Endosulfan on Residents of Kasargod, Kerala. Challenges of Chemical Engineer –need for sustainable alternatives for processes; products with environment friendly life-cycle. Introduction to novel materials and their development.\n" ;

        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void IntMech(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Thermodynamics: Nature and scope of thermodynamics; Basic concepts ; Laws  of  thermodynamics-  Discovery,  Significance  & Applications; Qualitative ideas on Entropy, Available energy, Irreversibility,  Clausius Inequality, Principle of increase of entropy & Carnot engine; Limitations of  Thermodynamics; Sources  of  power;  history  of  power  production; power production in the future.";
        m12="";
        m13="";
        m21="Thermal Engineering:   Historical development of steam engine, steam turbines,  gas  turbines      and  hydraulic  turbines;  Principle  of turbomachinery;   History of  IC  engines;    two  stroke and  four stroke engines-working,   applications;   Air   compressors-   types   and   uses; Principles   of   Rocket   propulsion,   chemical   rockets,   Indian   space programme\n" ;

        m22="";
        m23="";
        m31="Refrigeration & Air Conditioning: History & scope of refrigeration; applications of refrigeration; Food preservation, refrigerated storage; applications in chemical and process industries; special applications; Air conditioning-   Principles   &   systems;   scope   of   air   conditioning; Components of A/c systems, all-air and all-water A/c systems;, Psychrometric properties of air; Human comfort; comfort standards.\n";
        m32="";
        m33="";
        m41="Automobile    &    Aeronautical    Engineering:    Introduction    to    an Automobile; history of  the automobile; Indian Automobiles; Types of automobiles; Layout of an automobile;   Major components and their functions;   Manufacturers of motor vehicles in India;   Fundamentals of aerodynamics; theory of lift and drag;   aircraft engines-types and applications.\n";
        m42="";
        m43="";
        m51="Mechanisms   &   Machines:   Introduction;   Analysis   and   synthesis; terminology; definitions & assumptions; planar, spherical and spatial mechanisms, examples of mechanisms;   mobility; classification of mechanisms; Grashof’s law; mechanical advantage;    Mechanical Engineering design; types of design; design considerations; types of loads; factor  of  safety;  codes  &  standards;  economics  of  design;  reliability; safety.";
        m52="";
        m53="";
        m61="Manufacturing Engineering & Materials: Introduction and history of materials and manufacturing; engineering materials; metals, alloys, composites, microstructures, heat treatment, physical properties of materials and material testing; methods of manufacturing;   examples of manufactured products; Computer Integrated manufacturing; lean production & agile manufacturing; environmentally conscious design & manufacturing; organization for manufacture.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void ICPS(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Introduction to digital computer – Von Newman concept – A simple model of computer with acquisition of data, storage of data, processing of data, output of processed data. Details of functional units of a computer. Storage – primary storage and secondary storage. (The discussion should focus more on the functionalities of the units and their interaction than on specific hardware details. However, concepts like memory cells and their addressability (need not be binary), registers, inter- connections (buses) have to introduced at an abstract level. For storage devices – primary and secondary –, various categories have to be introduced along with their distinguishing features. For I-O devices also, various categories are to  be  introduced.   The  Von Newman concept should be effectively introduced. History computers need not be taught. However, students have to be encouraged to read the relevant sections of the text book. Chapters 1 – 4 of the first text book may be used to guide teaching and learning.) Introduction to programming languages: types of programming languages  - high level language , assembly language and machine language System software - Operating systems – objectives of operating systems, compiler, assembler and interpreter. (For all the above topics, focus more on the concepts, significance and objectives. Chapter 6 and 7 (up to 7.4) of the first text book may be used to guide the teaching-learning process.)\n";

        m12="";
        m13="";
        m21="Problem  Solving  strategies  –  Problem  analysis  –  formal  definition  of problem – Solution –       top- down design – breaking a problem into sub problems- overview of the solution to the sub problems by writing step by step procedure (algorithm) -  representation of  procedure by flowchart - Implementation of algorithms – use procedures to achieve modularity. (This part should initially look into problems in general instead of looking into computer-solvable problems alone.) Examples for algorithms and flow charts - at least 10 problems (starting with non numerical examples, and numeric problems like factorial, largest among three numbers, largest among N, Fibonacci etc.) must be discussed in detail. (Class assignments and/or tutorials may be used  to  strengthen understanding of this part. Chapters 4 and 5 of the second text book may be used for the teaching-learning process.)\n";

        m22="";
        m23="";
        m31="Introduction to Python – variables, expressions and statements, evaluation of expressions, precedence, string operations (Note:- the instructor can demonstrate  simple  programs  to  the  students  and  encourage  them  to develop similar ones. Chapters 1 and 2 of the third text book have to be covered.) Functions, calling functions, type conversion and coercion, composition of functions, mathematical functions, user-defined functions, parameters and arguments. (Note: - Chapter 3 of the second text book has to  be  covered.  The  instructor  should  demonstrate  each  aspect  of  the function with real examples and encourage students to develop their own.)";
        m32="";
        m33="";
        m41="Control statements, Boolean expressions and logical operators, conditional and alternative executions (Note: - Chapter 4 of the third text book up to Section 4.9 has to be covered. The instructor should demonstrate each of these concepts with real examples and encourage students to develop as many as possible.) Iteration - while statement and tables. (Note: - Chapter 6 of the third text book has to be covered.)\n";
        m42="";
        m43="";
        m51="Strings and lists – string traversal and comparison with examples.  (Note: - Chapter 7 of the third text book has to be covered.) List operations with examples (Note: - Chapter 8 of the third text book up to Section 8.6 has to be covered.); tuples and dictionaries – operations and examples (Note: - Chapters 9 & 10 of the third text have to be covered.)";
        m52="";
        m53="";
        m61="Files and exceptions – text files, directories (Note: - Chapter 11 of the thirdtext  book  has  to  be  covered.).  Introduction  to  classes  and  objects  – attributes, instances (Note: - Chapter 12 of the third text book up to Section 12.6 has to be covered.).";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void IntEle(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Fundamental   Concepts   of   Circuit   Elements   and   Circuit   variables:\n" +
                "Electromotive   force,   potential   and   voltage.   Resistors,   Capacitors, Inductors- terminal V-I relations. Electromagnetic Induction – Faraday’s laws, Lenz’s law, statically and dynamically induced emf, self and mutual inductance, coupling coefficient. Real and Ideal independent voltage and current sources, V-I relations. Passive sign convention. Numerical problems.";
        m12="";
        m13="";
        m21="Basic Circuit  Laws: Kirchhoff's current and  voltage laws,  analysis of resistive  circuits  -  mesh,  node  analysis,  super  mesh  and  super  node analysis. Star delta transformation. Magnetic Circuits: Magneto motive force, flux, reluctance, permeability- comparison of electric and magnetic circuits analysis of series and parallel magnetic circuits, magnetic circuits with air-gaps. Numerical problems.";
        m22="";
        m23="";
        m31="Alternating current fundamentals: Frequency, Period, RMS and average values, peak factor and form factor of periodic waveforms (pure sinusoidal and composite waveforms). Phasor Concepts, Complex representation (exponential, polar and rectangular forms) of sinusoidal voltages and currents, phasor diagrams, Complex impedance - series and parallel impedances and admittances. Phasor analysis of RL, RC, RLC circuits. Numerical problems";
        m32="";
        m33="";
        m41="Complex Power: Concept of power factor - active, reactive power and apparent power.   Resonance in series and parallel circuits: Energy, bandwidth and quality factor, variation of impedance and admittance in series and parallel resonant circuits. Numerical problems.\n";
        m42="";
        m43="";
        m51="Three-phase systems: Star and delta connections, three-phase three wire and three-phase four-wire systems, analysis of balanced and unbalanced star and delta connected loads, power in three-phase circuits. Numerical problems.";
        m52="";
        m53="";
        m61="Wiring systems: Basic concepts of wiring (conduit wiring only), service mains, meter board and distribution board.\n" +
                "Earthing: Earthing of installations - necessity of earthing, plate & pipe earthing. Protective devices: protective fuses, MCB, ELCB.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void BCE(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="General introduction to civil engineering - various disciplines of civil engineering, relevance of civil engineering in the overall infrastructural development of the country.Introduction to types of buildings as per nbc; selection of site for buildings.Components of a residential building and their functions.Introduction to industrial buildings – office / factory / software development office / power house /electronic equipment service centre (any one related to the branch of study) students have to visit one such building and submit an assignment about the features of any one of the listed building related to their branch (not included for exam)";
        m12="";
        m13="";
        m21="Building planning - introduction to planning of residential buildings- site plan, orientation of a building, open space requirements, position of doors and windows, size of rooms; preparation of a scaled sketch of the plan of a single storeyed residential building in a given site plan. Introduction to the various building area terms - computation of plinth area / built up area, floor area / carpet area - for a simple single storeyed building; setting out of a building.";
        m22="";
        m23="";
        m31="Surveying - principles and objectives of surveying; horizontal measurements – instruments used – tape, types of tapes; ranging (direct ranging only) – instruments used for ranging. Levelling - definitions, principles, instruments (brief discussion only) - level field book - reduction of levels - problems on levelling (height of collimation only). Modern surveying instruments – electronic distance meter, digital level, total station, gps (brief discussion only).\n";
        m32="";
        m33="";
        m41="Building Materials - Bricks, Cement Blocks - Properties And Specifications.cement – Opc, Properties, Grades; Other Types Of Cement And Its Uses (in Brief). Cement Mortar – Constituents, Preparation. Concrete – Pcc And Rcc – Grades. Steel - Use Of Steel In Building Construction, Types And Market Forms. market forms.\n";
        m42="";
        m43="";
        m51="Building construction – foundations; bearing capacity of soil (definition only); functions of foundations, types - shallow and deep (sketches only). Brick masonry – header and stretcher bond, english bonds – elevation and plan (one brick thick walls only). Roofs – functions, types, roofing materials (brief discussion only). Floors – functions, types; flooring materials (brief discussion only). Decorative finishes – plastering – purpose, procedure. Paints and painting – purpose, types, preparation of surfaces for painting (brief discussion only). ";
        m52="";
        m53="";
        m61="Basic infrastructure and services - elevators, escalators, ramps, air conditioning, sound proofing (civil engineering aspects only) towers, chimneys, water tanks (brief discussion only). Concept of intelligent buildings.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void BME(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Thermodynamics: Laws of Thermodynamics, significance and applications of laws of thermodynamics; entropy, available energy; Clausius inequality; principle of increase of entropy; Ideal and real gas equations; Analysis of Carnot cycle, Otto cycle , Diesel cycle and Brayton cycle; Efficiency of these cycles. ";
        m12="";
        m13="";
        m21="Energy conversion devices: Boilers, Steam turbines, Gas turbines and Hydraulic turbines; Working principle of two stroke and four stroke I.C. Engines (Diesel and Petrol), Reciprocating and centrifugal pumps, rotary pumps, reciprocating and centrifugal compressors, fans, blowers, rotary compressors; Air motor.";
        m22="";
        m23="";
        m31="Refrigeration and Air Conditioning: Vapour compression and absorption refrigeration systems, COP, Study of household refrigerator, Energy Efficiency Rating, Psychrometry, Psychrometric processes, window air conditioner, split air conditioner. Ratings and selection criteria of above devices. Refrigerants and their impact on environment";
        m32="";
        m33="";
        m41="Engines and Power Transmission Devices in Automobiles, Different types of engines used in automobiles, types of automobiles; major components and their functions (Description only); Fuels; Recent developments: CRDI, MPFI, Hybrid engines. Belts and belt drives; Chain drive; Rope drive; Gears and gear trains; friction clutch (cone and single plate), brakes (types and applications only); Applications of these devices.\n";
        m42="";
        m43="";
        m51="Materials and manufacturing processes: Engineering materials, Classification, properties, Alloys and their Applications; Casting, Sheet metal forming, Sheet metal cutting, Forging, Rolling, Extrusion, Metal joining processes - Powder metallurgy.\n" ;

        m52="";
        m53="";
        m61="\n" +
                "Machine Tools (Basic elements, Working principle and types of operations) Lathe – Centre Lathe, Drilling Machine – Study of Pillar drilling machine, Shaper, planer, slotter, Milling Machine, Grinding machine, Power saw; Introduction to NC and CNC machines.\n" ;

        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void BEE(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Elementary concepts of electric circuits: Kirchhoff’s laws, constant voltage and current sources, formation of network equations by node voltage and mesh current methods. Matrix representation - solution of network equations by matrix methods, star-delta conversion (Analysis of resistive networks only). Numerical problems.";
        m12="";
        m13="";
        m21="Magnetic circuits: MMF, field strength, flux density, reluctance, energy stored in magnetic circuits. Electromagnetic induction: Faraday’s laws, Lenz’s law-statically induced and dynamically Induced emfs- self-inductance and mutual inductance, coefficient of coupling. Alternating current fundamentals: Generation of alternating voltages, waveforms frequency, period, average and RMS values and form factor. Numerical problems.";
        m22="";
        m23="";
        m31="AC Circuits: Phasor representation of alternating quantities- rectangular, polar and exponential forms. Analysis of simple AC circuits - concept of impedance. Power and power factor in AC circuits- active, reactive and apparent power. Solution of RL, RC and RLC circuits. Three phase systems: Generation of three phase voltages- advantages of three phase systems, star and delta connection, three wire and four wire systems, relation between line and phase voltages, line and phase currents. Three phase power measurement by two wattmeter method. Numerical problems.\n";
        m32="";
        m33="";
        m41="Generation of power: Block schematic representation of generating stations- hydroelectric, thermal and nuclear power plants. Renewable energy sources. Power transmission and distribution: Typical electrical power transmission scheme, need for high voltage transmission, substation equipments, primary and secondary transmission and distribution systems.\n";
        m42="";
        m43="";
        m51="Transformers: construction of single phase and three phase transformers (core type only) – EMF equation, losses and efficiency. Electric Machines: D.C. Machines - Construction, types, principles of operation of dc motor, applications. AC Motors - Construction, principles of operation of single phase and three phase induction motor. Principle of operation of Universal motor. ";
        m52="";
        m53="";
        m61="Tariff: Different types of LT and HT consumers, tariff schemes - uniform tariff and differential tariff. Wiring systems: Basic concepts of wiring (conduit wiring only), service mains, meter board and distribution board. Earthing of installations - necessity of earthing, plate & pipe earthing, protective fuses, MCB, ELCB. Lamps: Different types of lamps - Incandescent lamps, fluorescent, mercury vapour, sodium vapour, metal halide and LED lamps.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void BLC(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Evolution of Electronics, Impact of Electronics in industry and in society. Resistors, Capacitors: types, specifications. Standard values, marking,colour coding. Inductors and Transformers: types, specifications, Principle of working. Electro mechanical components: relays and contactors. ";
        m12="";
        m13="";
        m21="PN Junction diode: Intrinsic and extrinsic semiconductors, Principle of operation, V-I characteristics, principle of working of Zener diode, Photo diode, LED and Solar cell. Bipolar Junction Transistors: PNP and NPN structures, Principle of operation, input and output characteristics of common emitter configuration, Typical specifications of low, medium and high power and frequency diodes and transistors, packaging. ";
        m22="";
        m23="";
        m31="Rectifiers and power supplies: Block diagram description of a dc power supply ,Half wave and full wave (including bridge) rectifier, capacitor filter, working of simple zener voltage regulator, Principle of SMPS Amplifiers and Oscillators: Circuit diagram and working of common emitter amplifier, Block diagram of Public Address system, concepts of feedback, working principles of oscillators, circuit diagram & working of RC phase shift oscillator. ";
        m32="";
        m33="";
        m41="Analogue Integrated circuits: Functional block diagram of operational amplifier, ideal operational amplifier, inverting and non inverting amplifier, comparator. Digital ICs: Logic Gates. Electronic Instrumentation: Principle and block diagram of digital multimeter, principle of digital storage oscilloscope, principle and block diagram of function generator.\n";
        m42="";
        m43="";
        m51="Radio communication: principle of AM & FM, frequency bands used for various communication systems, block diagram of super heterodyne receiver. Radar system: Principle, block diagram of pulsed radar. Satellite communication: concept of geo-stationary satellite, satellite transponder, advantages, principle of Global Positioning System. ";
        m52="";
        m53="";
        m61="Mobile communication: basic principles of cellular communications, concepts of cells, frequency reuse, principle and block diagram of GSM. Optical communication: block diagram of the optical communication system, principle of light transmission through fiber, advantages of optical communication systems. Entertainment and Security Electronics Technology: Basic principles of cable TV, CCTV, DTH system, HDTV, Plasma, LCD, LED TV.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void Cal(View view) {


        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Single Variable Calculus and Infinite  series (Book I –sec.6.1, 6.4, 6.5, 6.8, 9.3 to 9.9)\n" +
                "\n" +
                "Introduction. Exponential and Logarithmic functions. Graphs and Applications involving exponential and Logarithmic functions. Hyperbolic functions and inverses-derivatives and integrals. Indeterminate forms. Basic ideas of infinite series and convergence.  Convergence tests-comparison, ratio, root and integral tests   (without   proof).   Geometric   series   and   p-series.   Alternating   series, conditional and absolute convergence, Leibnitz test. Maclaurins series-Taylor series - radius of convergence.     (Sketching, plotting and interpretation of Exponential, Logarithmic and Hyperbolic functions using suitable software. Demonstration of convergence of series by mathematical software)";
        m12="";
        m13="";
        m21="Three dimensional space (Book I –sec.11.1, 11.7, 11.8)\n" +
                "\n" +
                "Rectangular coordinates in three space-graphs in three space, cylindrical surfaces – Quadric surfaces, Traces  of surfaces – the  quadric surfaces –Technique for graphing  quadric  surfaces-Translation  –  reflection  –technique  for  identifying\n" +
                "quadric surfaces, cylindrical and spherical coordinates-constant surfaces- converting coordinates-equations of surfaces in cylindrical and spherical coordinates.";
        m22="";
        m23="";
        m31="Three dimensional space (Book I –sec.11.1, 11.7, 11.8)\n" +
                "\n" +
                "Rectangular coordinates in three space-graphs in three space, cylindrical surfaces – Quadric surfaces, Traces  of surfaces – the  quadric surfaces –Technique for graphing  quadric  surfaces-Translation  –  reflection  –technique  for  identifying\n" +
                "quadric surfaces, cylindrical and spherical coordinates-constant surfaces- converting coordinates-equations of surfaces in cylindrical and spherical coordinates.";
        m32="";
        m33="";
        m41="Calculus of vector valued functions (Book I-12.1-12.6, 13.6,13.7, 14.9)\n" +
                "\n" +
                "Introduction to vector valued functions- parametric curves in 3-D space- parametric curves   generated with technology –Parametricequations for intersection of   surfaces -limits and continuity – derivatives - tangent lines – derivative of dot and cross product-definite integrals of vector valued functions- change of parameter-arclength-unit tangent-normal-binormal-curvature-motion along a curve –velocity-acceleration and speed – Normal and tangential components of acceleration. Directional derivatives and gradients-tangent planesand normal vectors-Lagrange multiplier method – extremum problem with constraint (vector approach).";
        m42="";
        m43="";
        m51="Multiple integrals (Book I-sec. 14.1, 14.2, 14.3, 14.5, 14.6, 14.7)\n" +
                "\n" +
                "Double integrals- Evaluation of double integrals – Double integrals in non- rectangular coordinates- reversing the order of integration-area calculated as a double integral- Double integrals in polar coordinates-   triple integrals-volume calculated as a triple integral-\n" +
                "triple integrals in cylindrical and spherical coordinates-   converting  triple   integrals   from   rectangular   to   cylindrical coordinates - converting triple integrals from rectangular to spherical coordinates- change of variables in multiple integrals- Jacobians (applications only).";
        m52="";
        m53="";
        m61="Vector integration (Book I sec. 15.1, 15.2, 15.3, 15.4, 15.5, 15.7, 15.8)\n" +
                "\n" +
                "Vector  field-  graphical  representation  of  vector  fields  –  gradient    fields  – conservative fields and potential functions – divergence and curl - the ∇ operator- the Laplacian ∇2,  line integrals - work as a line integral-independence of path- conservative vector field - Green’s   Theorem (without proof- only for simply connected region in plane),surface integrals – Divergence Theorem\n" +
                "(without proof) , Stokes’ Theorem (without proof)";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);






        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void Diff(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="FIRST ORDER ORDINARY DIFFERENTIAL EQUATIONS (Book 1. Sections: 1.1, 1.3, 1.4, 1.5, 1.6) Introduction –Basic Concepts, Modelling. Separable ODEs, Modelling- Exact ODEs, Integrating Factors-Linear ODEs, Bernoulli Equation, Population Dynamics-Orthogonal Trajectories. (Theorems need not be proved. Sketching, plotting and interpretation of solutions of differential equations using suitable software) ";
        m12="";
        m13="";
        m21="SECOND ORDER LINEAR ORDINARY DIFFERENTIAL EQUATIONS (Book 1. Sections: 2.1, 2.2, 2.4, 2.7, 2.8, 2.10) Homogeneous Linear ODEs of Second Order -- Homogeneous Linear ODEs with Constant Coefficients-Modelling of free oscillations of a Mass Spring system –Non-Homogeneous ODEs-Modelling: Forced Oscillations, Resonance – Solution by Variation of Parameters. (Theorems need not be proved. Sketching, plotting and interpretation of solutions of differential equations using suitable software)";
        m22="";
        m23="";
        m31="HIGHER ORDER LINEAR ORDINARY DIFFERENTIAL EQUATIONS (Book 1. Section: 3.1, 3.2, 3,2) Homogeneous linear ODEs- Initial value problem-Existence, uniqueness (without proof)- Homogeneous linear ODEs with constant coefficients- Non-Homogeneous linear ODEs-Method of variation of Parameters- Bending of elastic beam under a load. (Theorems need not be proved)\n";
        m32="";
        m33="";
        m41="FOURIER SERIES (Book 2. Section: 4.1, 4.2, 4.3, 4.4) Periodic Functions-Orthogonality of Sin and Cosine functions- Euler’s formula-Fourier series for even and odd functions-Half range expansions- half range Fourier cosine series - Half range Fourier sine series. (Use of soft ware’s to understand the convergence of Fourier series, sketching of partial sums)\n";
        m42="";
        m43="";
        m51="PARTIAL DIFFERENTIAL EQUATION (Book 2. Section: 5.1.1, 5.1.2, 5.1.3, 5.1.4, 5.1.5, 5.1.9, 5.1.10, 5.2.6, 5.2.7, 5.2.8, 5.2.9, 5.2.10) Formation of PDEs-solutions of a first order PDE- General integral from complete solution-Method for solving first order PDE-Lagrange’s Method-Linear PDE with Constant Coefficients-Solution of Linear Homogeneous PDE with Constant Coefficient.  ";
        m52="";
        m53="";
        m61="APPLICATIONS OF PARTIAL DIFFERENTIAL EQUATIONS (Book 2. Section: 6.1, 6.2, 6.3, 6.4, 6.7, 6. 8, 6. 9, 6.9.1, 6.9.2) Method of Separation of Variables- Wave equation-Vibrations of a Stretched sting, Solution of one dimensional equation-The equation of Heat conduction – One dimensional Heat equation- Solution of one dimensional Heat equation –A long insulated rod with ends at zero temperatures- A long insulated rod with ends at non-zero temperatures.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void Phy(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Oscillations and Waves\n" +
                "Harmonic Oscillations: Differential equation of   damped harmonic oscillation, forced harmonic oscillation and their solutions- Resonance, Q factor, Sharpness of resonance- LCR circuit as an electrical analogue of Mechanical Oscillator (Qualitative)\n" +
                "Waves: One dimensional wave- differential equation and solution. Three dimensional waves – Differential equation & its solution. Transverse vibrations of a stretched string.";
        m12="";
        m13="";
        m21="Crystal Structure, Superconductors\n" +
                "\n" +
                "Crystal Structure: Space lattice-Unit cell and lattice parameters-Directions and Planes in crystals- Miller indices- Interplanar spacing in terms of Miller indices. Braggs law- X-ray diffraction\n" +
                "Superconductivity: Superconducting phenomena. Meissner effect. Type-I and Type-II superconductors. BCS theory (qualitative). High temperature superconductors.-  Josephson  Junction  –  SQUID-  Applications  of superconductors.";
        m22="";
        m23="";
        m31="Physical Optics\n" +
                "Interference: Coherence. Interference in thin films and wedge shaped films (Reflected system) Newton’s rings-measurement of wavelength and refractive index of liquid Interference filters. Antireflection coating.\n" +
                "Diffraction: Fresnel and Fraunhofer diffraction. Fraunhofer diffraction at a single slit. Plane transmission grating. Grating equation-measurement of wavelength. Rayleigh’s criterion for resolution. Resolving power and dispersive power of grating.\n" +
                "Polarization of Light: Types of polarized light. Double refraction. Nicol Prism. Quarter wave plate and half wave plate. Production and detection of circularly and elliptically polarized light. Laurent’s Half shade Polarimeter- Kerr Cell - Polaroids & applications.\n";
        m32="";
        m33="";
        m41="Introduction to Quantum Mechanics and Statistical Mechanics\n" +
                "Quantum Mechanics: Uncertainty principle and its applications-  formulation of Time dependent and Time independent Schrödinger equations- physical meaning of wave function- Energy and momentum Operators-Eigen values and functions- Expectation values-   One dimensional infinite square well potential .Quantum mechanical Tunnelling (Qualitative)\n" +
                "Statistical Mechanics: Macro states and Microstates. Phase space. Basic postulates  of  Maxwell-  Boltzmann,  Bose-Einstein  and  Fermi  Dirac  statistics. Distribution  equations  in  the  three  cases  (no  derivation).  Density  of  states.\n" +
                "Derivation of Planck’s radiation formula. Free electrons in a metal as a Fermi gas. Fermi energy\n";
        m42="";
        m43="";
        m51="Acoustics and Ultrasonics\n" +
                "Acoustics: Intensity of sound- Loudness-Absorption coefficient - Reverberation and reverberation time - Significance of reverberation time-Sabine’s formula (No derivation) - Factors affecting acoustics of a building.\n" +
                "Ultrasonics: Production of ultrasonic waves- Magnetostriction effect and Piezoelectric effect- Piezoelectric oscillator - Detection of ultrasonics - Thermal and piezoelectric methods - Applications of ultrasonics - NDT and medical.";
        m52="";
        m53="";
        m61="Laser: Properties of Lasers, Absorption, Spontaneous and stimulated emissions, Population inversion, Einstein’s coefficients, Working principle of laser, Optical resonant   cavity.   Ruby   Laser,   Helium-Neon   Laser,   Semiconductor   Laser (qualitative). Applications of laser, holography (Recording and reconstruction) Photonics: Basics of   solid state lighting- LED -Photo detectors- photo voltaic cell, junction & avalanche photo diodes, photo transistors, Thermal detectors, Solar cells- I-V characteristics –Optic fibre-Principle of propagation-numerical aperture-optic communication system (block diagram) -Industrial, medical and technological  applications  of  optical  fibre.  Fibre  optic  sensors  -  Intensity modulated, phase modulated and polarization modulated sensors.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void Chem(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Spectroscopy:\n" +
                "Introduction, Beer Lamberts Law (problems to be worked out),\n" +
                "UV-visible spectroscopy – Principle, Instrumentation and applications; IR spectroscopy – Principle and applications;\n" +
                "1H NMR spectroscopy – Principle, chemical shift – spin-spin splitting and applications including MRI.";
        m12="";
        m13="";
        m21="Electrochemistry:\n" +
                "Types of electrodes - SHE, Calomel electrode, Glass electrode,Electrochemical  series  and  its  applications  including  Decomposition potential and Overvoltage,Nernst equation- Derivation and application Potentiometric titration – Acid-base and redox titration, Lithium ion cell and Fuel cell.";
        m22="";
        m23="";
        m31="Instrumental Methods\n" +
                "Thermal analysis-Principle, instrumentation and applications of TGA and DTA. Chromatographic methods - Basic principles,column,TLC. Instrumentation and principles of GC and HPLC. Conductivity - Measurement of conductivity";
        m32="";
        m33="";
        m41="Chemistry of Engineering Materials\n" +
                "Copolymers - BS, ABS - Structure and Properties.Conducting Polymers - Polyaniline, Polypyrrole - Preparation, Structure and Properties.OLED – Preparation, Structure and Properties.Advanced Polymers – Kevlar, Polybutadiene rubber and silicone rubber.– Preparation, Structure and Properties.Nanomaterials   –   Definition,   Classification,   Chemical   methods   of preparation (Any 2 methods),\n" +
                "Properties and Applications – Carbon Nano Tubes and fullerenes.\n";
        m42="";
        m43="";
        m51="Fuels and Lubricants\n" +
                "Fuels - Calorific Value, HCV and LCV - Determination of calorific valueof a solid and liquid fuel by Bomb calorimeter - Dulongs formula and Numericals. Liquid fuel -  Petrol and Diesel -  Octane number & Cetane number - Biodiesel - Natural gas. Lubricant - Introduction, solid, semisolid and liquid lubricants. Properties of lubricants - Viscosity Index, Flash point, Fire point, Cloud point, Pour point and Aniline point.";
        m52="";
        m53="";
        m61="Water Technology\n" +
                "Types of hardness, Estimation of Hardness - EDTA method,Water softening methods - Ion exchange process - Principle. Polymer ion exchange - Reverse Osmosis - Disinfection method by chlorination and UV Dissolved oxygen, BOD and COD.Sewage water Treatment - Trickling Filter and UASB process.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void Mech(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);

        m11="Statics: Fundamental concepts and laws of mechanics – Rigid body –Principle of transmissibility of forces Coplanar force systems - Moment of a force – Principle of moments Resultant of force and couple system Equilibrium  of  rigid  body  –  Free  body  diagram  –  Conditions  of equilibrium in two dimensions – Two force and three force members.";
        m12="";
        m13="";
        m21="Types  of  supports  –  Problems  involving  point  loads  and  uniformly distributed loads only.Force systems in space – Degrees of freedom – Free body diagram – Equations of equilibrium – Simple resultant and Equilibrium problems.";
        m22="";
        m23="";
        m31="Properties of planar surfaces – Centroid and second moment of area (Derivations not required) - Parallel and perpendicular axis theorem – Centroid and Moment of Inertia of composite area.Polar Moment of Inertia – Radius of gyration – Mass moment of inertia of cylinder and thin disc (No derivations required).Product of inertia – Principal Moment of Inertia (conceptual level).Theorems of Pappus and Guldinus.\n";
        m32="";
        m33="";
        m41="Friction – Characteristics of dry friction – Problems involving friction of ladder, wedges and connected bodies. Definition of work and virtual work – Principle of virtual work for a system of connection bodies – Problems on determinate beams only.";
        m42="";
        m43="";
        m51="Dynamics: Rectangular and Cylindrical co-ordinate system Combined motion of rotation and translation – Concept of instantaneous centre – Motion of connecting rod of piston and crank of a reciprocating pump. Rectilinear translation – Newton’s second law – D’Alembert’s Principle – Application to connected bodies (Problems on motion of lift only).";
        m52="";
        m53="";
        m61="Mechanical vibrations – Free and forced vibration - Degree of freedom.Simple harmonic motion – Spring-mass model – Period – Stiffness –\n" +
                "Frequency – Simple numerical problems of single degree of freedom.";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void Gra(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="Introduction to Engineering Graphics: Drawing instruments; BIS code of practice for general engineering drawing; Construction of Conic sections by eccentricity method; Construction of Cycloids, Involutes, Spirals and Helix.";
        m12="";
        m13="";
        m21="Orthographic  projections  of  points  and  lines:-Projections  of  points  in different quadrants; Projections of straight lines inclined to one or both of the reference planes; True length and inclination of lines with reference planes; Traces of lines.";
        m22="";
        m23="";
        m31="Orthographic projections of solids:-Projections of simple solids* in simple positions, axis inclined to one of the reference planes and axis inclined to both the reference planes-use change of position method OR auxiliary projection method.";
        m32="";
        m33="";
        m41="Sections of solids:-Sections of simple solids* in simple vertical positions with section plane perpendicular/inclined to one of the reference planes – True shapes of sections.";
        m42="";
        m43="";
        m51="Development of surfaces of simple solids and cut regular solids; Intersection  of  surfaces:-Intersection of  prism  in  prism  &  cylinder  in cylinder- axis bisecting at right angles only.";
        m52="";
        m53="";
        m61="Isometric Projections:-Isometric projections and views of simple and truncated simple solids, sphere, hemisphere and  their  combinations in simple position. Conversion of Pictorial views to Orthographic views by free hand sketching.\n" +
                "Introduction to Computer Aided Drafting - Preparation of engineering drawings by using any software capable of drafting and modeling. (For internal work assessment only, not for University Examination)";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void PhyL(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void CheL(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void CivW(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void MechW(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void EEW(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void LCW(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void CSW(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void CheW(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }public void DE(View view) {

        Intent i  = new Intent (TransitionFirstActivity.this,
                TransitionSecActivity.class);
        m11="";
        m12="";
        m13="";
        m21="";
        m22="";
        m23="";
        m31="";
        m32="";
        m33="";
        m41="";
        m42="";
        m43="";
        m51="";
        m52="";
        m53="";
        m61="";
        m62="";
        m63="";
        i.putExtra("m11",m11);
        i.putExtra("m12",m12);
        i.putExtra("m13",m13);
        i.putExtra("m21",m21);
        i.putExtra("m22",m22);
        i.putExtra("m23",m23);
        i.putExtra("m31",m31);
        i.putExtra("m32",m32);
        i.putExtra("m33",m33);
        i.putExtra("m41",m41);
        i.putExtra("m42",m42);
        i.putExtra("m43",m43);
        i.putExtra("m51",m51);
        i.putExtra("m52",m52);
        i.putExtra("m53",m53);
        i.putExtra("m61",m61);
        i.putExtra("m62",m62);
        i.putExtra("m63",m63);

        ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                TransitionFirstActivity.this,Pair.create(mFabButton, "fab"), Pair.create(mHeader, "holder1"));

        startActivity(i, transitionActivityOptions.toBundle());
    }
}
