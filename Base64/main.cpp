#include <iostream>
#include <cmath>

using namespace std;

// D�claration des variables
    short taille, valueToDecimal[255], val[255],w ;


int main()
{

       return 0;
}


//D�claration des m�thodes
static string Encode (int source [])
{
    // On r�cup�re la taille de notre tableau
    taille = sizeof(source)/ sizeof(*source);

    //On v�rifie si la taille de notre tableau est un multiple de trois (3)
    if(taille%3 == 0 )
    {
       for (int i =0; i<=taille; i++)
       {
           valueToDecimal[i]= decToBinary(10);

       }

       for(i=0; i<=(taille*8);i++)
       {
           w=valueToDecimal[i];

           for(j=0; j<= w.toSize();j++)
           {


           }
       }
    }
    else
    {
        return "Le nombre de valeur que contient le tableau n'est pas un mutiple de trois (3)...";
    }



}



