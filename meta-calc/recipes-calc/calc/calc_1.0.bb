SUMMARY = "Simple calc application"
SECTION = "applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://.."

S = "${WORKDIR}/calc"

DEPENDS = "libcalc"
RDEPENDS_${PN} = "libcalc"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
	oe_runmake
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 calc ${D}${bindir}
}
