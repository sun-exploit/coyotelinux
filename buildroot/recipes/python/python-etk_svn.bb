require python-efl.inc
DEPENDS += "etk python-evas python-ecore"
RDEPENDS += "python-evas python-ecore python-edje python-numeric python-math etk-themes" 
PV = "0.1.1+svnr${SRCREV}"
PR = "ml1"

do_stage() {         
	distutils_stage_all 
}  
