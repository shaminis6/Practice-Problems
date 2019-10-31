package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	
	int V;
	LinkedList<Integer> adjList[];
	
	Graph(int v)
	{
		V=v;
		adjList =new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adjList[i]=new LinkedList<>();
		}
	}
	
	void addEdge(Graph graph,int src,int dest)
	{
		graph.adjList[src].add(dest);
	}
	
	void printEdges(Graph graph)
	{
		for(int i=0;i<graph.V;i++)
		{
			System.out.print(i);
			for(int edge: graph.adjList[i])
			{
				System.out.print(" -> "+edge);
			}
			System.out.println();
		}
	}
	
	void bfsTraversal(Graph graph,int vertex)
	{
		Queue<Integer> que = new LinkedList<Integer>();
		boolean visited[]=new boolean[graph.V];
		
		visited[vertex]=true;
		que.add(vertex);
		
		while(!que.isEmpty())
		{
			int v=que.poll();
			System.out.println("");
			for(int edge:graph.adjList[v])
			{
				if(!visited[edge])
				{
					visited[edge]=true;
					que.add(edge);
				}
			}
			
		}
		
		
		
	}
	public static void main(String args[])
	{
		Graph graph=new Graph(5);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 4, 5);
		graph.printEdges(graph);
	}
	

}
