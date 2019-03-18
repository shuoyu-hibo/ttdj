package com.mybatis.xml.generator;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import sun.rmi.runtime.Log;

public class MybatisGenerator {

	/**
	 * @param args
	 * @throws XMLParserException 
	 * @throws IOException 
	 * @throws InvalidConfigurationException 
	 */
	private static Logger log4j = Logger.getLogger(MyBatisGenerator.class);
	public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException {
		// TODO Auto-generated method stub
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			File configFile = new File("src/com/mybatis/xml/generator/mybatisGeneratorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log4j.error(e.getMessage());
			
		}
	}

}
