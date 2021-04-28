package com.example.fragmentrecyclearview;

import java.util.ArrayList;

public class ListGalleryData {
    private static String[]
            title = new String[]{"Gunung Lawu",
            "Gunung Merapi","Gunung Merbabu",
            "Gunung Sindoro","Gunung Slamet",
            "Gunung Sumbing","Gunung Ungaran",
            "Gunung Andong", "Gunung Kembang",
            "Gunung Bismo","Gunung Prau"};

    private static int[] photo = new
            int[]{R.drawable.lawu,R.drawable.merapi,R.drawable.merbabu,
            R.drawable.sindoro,R.drawable.slamet,R.drawable.sumbing,
            R.drawable.ungaran,R.drawable.andong,R.drawable.kembang,
            R.drawable.bismo,R.drawable.prau};

    private static String[] detail = new String[]{
            "Gunung Merbabu adalah gunung api yang bertipe Strato yang terletak secara geografis pada 7,5° LS dan 110,4° BT",
            "Gunung Merapi adalah gunung berapi di bagian tengah Pulau Jawa dan merupakan salah satu gunung api teraktif di Indonesia.",
            "Gunung Lawu terletak di Pulau Jawa, Indonesia, tepatnya di perbatasan Provinsi Jawa Tengah dan Jawa Timur. Gunung Lawu terletak di antara tiga kabupaten yaitu Kabupaten Karanganyar, Jawa Tengah, Kabupaten Ngawi, dan Kabupaten Magetan, Jawa Timur. ",
            "Gunung Sindoro, biasa disebut Sindara, atau juga Sundoro merupakan sebuah gunung volkano aktif yang terletak di Jawa Tengah, Indonesia, dengan Temanggung sebagai kota terdekat. Gunung Sindoro terletak berdampingan dengan Gunung Sumbing. Gunung sindara dapat terlihat jelas dari puncak sikunir dieng",
            "Gunung Slamet adalah sebuah gunung berapi kerucut yang terdapat di Pulau Jawa, Indonesia. Gunung Slamet terletak di antara 5 kabupaten, yaitu Kabupaten Brebes, Kabupaten Banyumas, Kabupaten Purbalingga, Kabupaten Tegal, dan Kabupaten Pemalang, Provinsi Jawa Tengah",
            "Gunung Sumbing adalah gunung api yang terdapat di Jawa Tengah, Indonesia., Gunung Sumbing merupakan gunung tertinggi ketiga di Pulau Jawa setelah Gunung Semeru dan Gunung Slamet. Gunung ini secara administratif terletak di tiga wilayah kabupaten, yaitu Kabupaten Magelang; Kabupaten Temanggung; dan Kabupaten Wonosobo.",
            "Gunung Ungaran adalah gunung berapi bertipe Stratovolcano yang terletak di Ungaran, Kabupaten Semarang, Jawa Tengah dan memiliki ketinggian 2.050 meter.",
            "Gunung Andong adalah gunung tipe perisai yang terletak di Kabupaten Magelang, berbatasan langsung dengan Kabupaten Semarang dan Kota Salatiga, Provinsi Jawa Tengah. Berketinggian 1.726 mdpl, Gunung Andong hingga saat ini tercatat belum pernah sekalipun meletus.",
            "Gunung Kembang adalah gunung setinggi 2340 mdpl di Kabupaten Wonosobo, Jawa Tengah. Gunung ini seringkali disebut sebagai anak Gunung Sindoro. Posisinya memang berada tepat di samping gunung tersebut.",
            "Gunung Bismo merupakan sebuah gunung dengan ketinggian 2365 Mdpl. Terletak di kabupaten Wonosobo tepatnya di perbatasan Desa Campursari dan Desa Sikunang, Kecamatan Kejajar, Kabupaten Wonosobo.",
            "Gunung Prau terletak di kawasan Dataran Tinggi Dieng, Jawa Tengah, Indonesia. Gunung Prahu terletak pada koordinat 7°11′13″S 109°55′22″E. Gunung Prau merupakan tapal batas antara empat kabupaten yaitu Kabupaten Batang, Kabupaten Kendal, Kabupaten Temanggung dan Kabupaten Wonosobo."
    };

    public static ArrayList<ListGalleryModel> getListData(){
        ListGalleryModel listGalleryModel  = null;
        ArrayList<ListGalleryModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++){
            listGalleryModel = new ListGalleryModel();
            listGalleryModel.setMountPhoto(photo[i]);
            listGalleryModel.setMountName(title[i]);
            listGalleryModel.setMountDetail(detail[i]);
            list.add(listGalleryModel);
        }
        return list;
    }

}
