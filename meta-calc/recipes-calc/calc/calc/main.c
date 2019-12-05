#include <stdio.h>
#include "libcalc.h"

int main(int argc, char **argv)
{
	printf("1 + 2 = %d\n", add(1, 2));
	printf("3 - 1 = %d\n", sub(3, 1));
	printf("2 * 5 = %d\n", mul(2, 5));
	printf("9 / 3 = %d\n", div(9, 3));

	return 0;
}
