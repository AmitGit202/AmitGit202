package ProgramStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
	//	@Test
	public void regular()
	{
		List<String> names = new ArrayList<String>();
		names.add("Amar");
		names.add("Raman");
		names.add("Asit");
		names.add("Ajay");
		names.add("Nitu");
		int count =0;

		for (int i=0; i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}

		}
		System.out.println(count);

	}
	/* ---------------------------Optimization process---------------------*/
	//@Test
	public void streamFilter()
	{
		List<String> names = new ArrayList<String>();
		names.add("Amari");
		names.add("Raman");
		names.add("Asit");
		names.add("Ajay");
		names.add("Nitu");
		/*
		 * There is no life of intermediate operation if there is no terminal
		 * Terminal operation will execute only if intermediate operation(filter) return Trur
		 * we can create stream
		 * how to use filter in stream API 

		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		 */
		Long d = Stream.of("Amari","Raman","Asit","Ajay","Nitu").filter(t->
		{
			t.startsWith("A");
			return true;
		}).count();

		System.out.println(d);
		//Print all the Names of ArrayList

		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}
	@Test
	public void DuplicatestreamFilter()
	{
		List<String> names = new ArrayList<String>();
		names.add("Amari");
		names.add("Raman");
		names.add("Asit");
		names.add("Ajay");
		names.add("Nitu");
		/*
		 * There is no life of intermediate operation if there is no terminal
		 * Terminal operation will execute only if intermediate operation(filter) return Trur
		 * we can create stream
		 * how to use filter in stream API 

		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		 */
		Long d = Stream.of("Amari","Raman","Asit","Ajay","Nitu").filter(t->
		{
			t.startsWith("A");
			return true;
		}).count();

		System.out.println(d);
		//Print all the Names of ArrayList

		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}
	//	@Test
	public void stramMap()
	{
		List<String> names = new ArrayList<String>();
		names.add("Man");
		names.add("Woman");
		names.add("None");
		names.add("Yes");
		names.add("No");
		names.add("None of the above");
		//Print names which have last letter "a" with Upercase
		Stream.of("Amari","Rama","Asit","Ajay","Nitu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));

		List<String> namesList =Arrays.asList("Amari","Rama","Asit","Ajay","Nitu");
		namesList.stream().filter(s->s.startsWith("A")).sorted()
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		//Merging 2 different Lists
		Stream<String> newStraem = Stream.concat(names.stream(), namesList.stream());
		//newStraem.sorted().forEach(s->System.out.println(s));
		boolean flag = newStraem.anyMatch(s->s.equalsIgnoreCase("Rama"));
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Amari","Rama","Asit","Ajay","Nitu").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));


		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//Print Unique number from this array
		//Sort the array  -3rd index 1,2,3,5,7,9
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));	
	}

}


