#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Segment{
    int L, R;
};

bool compare(const Segment &s1, const Segment &s2){
    return s1.L < s2.L;
}

int main(){  
    int numberCases;
    cin >> numberCases;
    while ( numberCases--){
        int M;
        cin >> M;
        vector<Segment> S(1);
        while (cin >> S[0].L >> S[0].R, !(S[0].L == 0 && S[0].R == 0))
            S.push_back(S[0]);
        sort(S.begin() + 1, S.end(), compare);
        int curL = 0, rReach = 0;
        size_t i = 1;
        vector<Segment> segments;
        while (rReach < M){
            // se escoje el segmento que se extiende mas a la derecha, cumpliendo que L<=a la L actual
            int newL = curL;
            size_t farthest = 0;    
            for ( ; i < S.size(); ++i){
                if (S[i].L > curL)
                    break;
                else if (S[i].R >= newL){ 
                    newL = S[i].R;
                    farthest = i;
                }
            }
            if (farthest == 0)
                break;
            segments.push_back(S[farthest]);
            curL = rReach = newL;
        }
        if (rReach >= M){
            cout << segments.size() << endl;
            for (size_t i = 0; i < segments.size(); ++i)
                cout << segments[i].L << " " << segments[i].R << endl;
        }
        else
            cout << "0" << endl;
        if (numberCases)
            cout << endl;
    }
    return 0;
}


//size_t =  tipo de entero sin signo