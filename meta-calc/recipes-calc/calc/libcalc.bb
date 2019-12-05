SUMMARY = "Simple calc library"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGES = "${PN}"
PROVIDES = "${PN}"

FILES_${PN} += "${libdir}/libcalc.so"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

SRC_URI = "file://."
S = "${WORKDIR}"
TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
	oe_runmake
}

do_install() {
	     install -d ${D}${libdir}
	     install -m 0755 libcalc.so ${D}${libdir}
}
