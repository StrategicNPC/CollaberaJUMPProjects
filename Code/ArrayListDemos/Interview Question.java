//Create a loop that deletes every element if the element before it is less than it

int i = 1;
while (i < ArrayList.size()){
    if (ArrayList.get(i) < ArrayList.get(i-1)){
        ArrayList.remove(i);
        i--;
    }
    i++;
}