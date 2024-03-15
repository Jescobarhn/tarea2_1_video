package com.example.tarea2_1_video.Tablas;

public class Transacciones {

    public static final String NameDatabase = "PM01DB";

    public static final String TbVideos = "videos";

    public static final String id = "id";


    public static final String CTvideos = "CREATE TABLE videos (id INTEGER PRIMARY KEY AUTOINCREMENT)";

    public static final String GetVideos = "SELECT * FROm " + Transacciones.TbVideos;

    public static final String DropTVideos = "DROP TABLE IF EXISTS videos";

}
