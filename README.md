# ImportTSV Mapper

This is the default ImportTSVMapper that is in the ImportTsv utility.  This project can be used to develop a new mapper and override the default mapper in the ImportTSV. See below the system property to override the mapper.

Usage: importtsv -Dimporttsv.columns=a,b,c <tablename> <inputdir>
  -Dimporttsv.mapper.class=my.Mapper - A user-defined Mapper to use instead of org.apache.hadoop.hbase.mapreduce.TsvImporterMapper

