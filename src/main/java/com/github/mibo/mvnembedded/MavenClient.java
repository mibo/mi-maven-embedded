package com.github.mibo.mvnembedded;

import org.apache.maven.cli.MavenCli;

import java.io.File;

public class MavenClient {

  public static void main(String[] args) {

    System.out.println(new File(".").getAbsolutePath());
    System.out.println(System.getenv());
    MavenCli cli = new MavenCli();
    cli.doMain(new String[]{"clean", "package", "-Dmaven.multiModuleProjectDirectory=."},
        "/Users/michael/Dev/Projects/maven-cli/", System.out, System.out);
  }
}