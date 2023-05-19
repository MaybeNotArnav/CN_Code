#include <stdio.h>

void main()
{
    int data[8];
    int i;
    int recData[8];
    int c1, c2, c3, c;

    printf("Enter the data bits one by one\n");
    scanf("%d", &data[3]);
    scanf("%d", &data[5]);
    scanf("%d", &data[6]);
    scanf("%d", &data[7]);

    data[1] = data[3] ^ data[5] ^ data[7];
    data[2] = data[3] ^ data[6] ^ data[7];
    data[4] = data[5] ^ data[6] ^ data[7];

    for (i = 1; i < 8; i++)
        printf("%d", data[i]);

    printf("\nEnter the received data bits one by one\n");
    for (i = 1; i < 8; i++)
    {
        scanf("%d", &recData[i]);
    }

    c3 = recData[1] ^ recData[3] ^ recData[5] ^ recData[7];
    c2 = recData[2] ^ recData[3] ^ recData[6] ^ recData[7];
    c1 = recData[4] ^ recData[5] ^ recData[6] ^ recData[7];

    c = c1 * 4 + c2 * 2 + c3;

    printf("Error at %d index\n", c);
}