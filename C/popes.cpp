#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){

    int y, p, a, l , i;

    while (cin >> y){
        vector<int> years(0);
        cin >> p;
        
        while (p--){
            cin >> a;
            years.push_back(a);
        }

        int begin = 0;
        int end = 0;
        int best = 0;

        for (i = 0; i < years.size(); i++){
            int aux = years[i] + y - 1;
            int Ri = i - 1;
            l = years.size();

            while (l - Ri > 1){
                int mitad = Ri + (l-Ri)/2;
                if (years[mitad] <= aux){
                    Ri = mitad;
                }else{
                    l = mitad;
                }    
            }

            if (best < Ri - i + 1){
                best = Ri - i + 1;
                begin = years[i];
                end = years[Ri];
            }
        }


        cout << best << " " << begin << " " << end << endl;
    }
}


