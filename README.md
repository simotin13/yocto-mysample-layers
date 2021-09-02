# Usage
```
# install packages for yocto
$ sudo apt install -y gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath libsdl1.2-dev xterm autoconf automake libtool libglib2.0-dev

# make dir at user-home/yocto
$ cd
$ mkdir yocto
$ cd yocto

# get poky(3.0 zeus)
$ git clone -b zeus git://git.yoctoproject.org/poky.git

# get sample layers(this repository)
$ git clone git@github.com:simotin13/yocto-mysample-layers.git
   
# initialize env
$ source ./poky/oe-init-build-env build_bbb

# updatebblayers.conf, local.conf
# In bblayers.conf, add meta-calc to bblayers.conf
# note:
# layer path is '$HOME/yocto/octo-mysample-layers/meta-calc', change it suit your environment.
$ cp ../../yocto/yocto-mysample-layers/meta-calc/build_conf_sample/bblayers.conf conf/

# Note:
# In local.conf, I set MACHINE ?= "beaglebone-yocto", and Add calc module to Image.
$ cp ../../yocto/yocto-mysample-layers/meta-calc/build_conf_sample/local.conf conf/

# build core-image-minimal(calc and libcalc module included)
$ bitbake core-image-minimal

```

# note
About more detail, see my blog(Japanese).
https://mcommit.hatenadiary.com/entry/2019/12/05/235100
