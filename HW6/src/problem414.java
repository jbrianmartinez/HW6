

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian Martinez
 */
public class problem414 {
    public static void main(String[] args)
    {
        In in = new In("tinyGex2.txt");
        Graph G = new Graph(in);
        //System.out.println(G);
        
        In pairs = new In("pairs.txt");
        while (pairs.hasNextLine())
        {
            int v = pairs.readInt();
            int w = pairs.readInt();
            if (G.hasEdge(v, w))
            {
                System.out.println(v + "-" + w + " exists");
            }
            else
            {
                System.out.println(v + "-" + w + " does not exist");
            }
        }
    }
}
