#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c"

S = "${WORKDIR}"
FILES_${PN} += "/home/miyazaki/helloworld"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

inherit useradd
USERADD_PACKAGES = "${PN}"
PASSWORD ?= "my_passwd"
USERADD_PARAM_${PN} = "simotin13 --password ${PASSWORD}"

do_compile() {
	     ${CC} helloworld.c -o helloworld
}

do_install() {
	     install -d ${D}/home/miyazaki
	     install -o simotin13 -m 0755 helloworld ${D}/home/miyazaki
}
