#include<stdio.h>
#include<stdlib.h>

#define MAXSIZE 10
struct ArrayStack
{
   int capacity;
   int top;
   int *array;
};

struct ArrayStack *createArrayStack()
{
    struct ArrayStack *s= malloc(sizeof(struct ArrayStack));
    if (!s)
    {
        return NULL;
    }
    s->capacity=MAXSIZE;
    s->top=-1;
    s->array=malloc(s->capacity* sizeof(int));
}

int isEmpty(struct ArrayStack* s)
{
    return(s->top==-1);
}
int isFull(struct ArrayStack* s)
{
    return(s->top==s->capacity-1);
}

void push(struct ArrayStack* s,int data)
{
    if (isFull)
    {
        printf("Stack is Full");
    }
    else
    {
        s->array[++s->top]= data;
    }
}

void main()
{
    printf("Hello MF!");
}