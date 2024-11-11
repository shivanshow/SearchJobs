//package com.JobSearch.SearchForJobs.loader;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Component;
//
//import com.JobSearch.SearchForJobs.entity.UrlTable;
//import com.JobSearch.SearchForJobs.service.TableService;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
// @Autowired
//  private TableService tableService;
//
//  @Override
//  public void run(String... args) throws Exception {
//      // Load the file from resources
//      ClassPathResource resource = new ClassPathResource("Companies.txt");
//
//      // Read each line from the file and save it as a new UrlTable entry
//      try (BufferedReader reader = new BufferedReader(
//              new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8))) {
//
//         String line;
//         while ((line = reader.readLine()) != null) {
//             if (!line.trim().isEmpty()) { // Skip empty lines
//                 UrlTable urlTable = new UrlTable();
//                  urlTable.setUrl(line); // Set URL from each line
//                  tableService.saveMyEntity(urlTable); // Save to database
//                 System.out.println("Saved URL: " + line);
//              }
//          }
//     }
//
//      System.out.println("All URLs saved to database!");
//  }
//}
//
