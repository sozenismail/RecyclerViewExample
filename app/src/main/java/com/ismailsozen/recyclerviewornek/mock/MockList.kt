package com.ismailsozen.recyclerviewornek.mock

import com.ismailsozen.recyclerviewornek.model.WriterModel

object MockList {

    fun getMockedWriterList(): List<WriterModel> {


        val writerModel = WriterModel(
            "İsmail Sözen",
            "sozendev@gmail.com",
            "Android Geliştirici",
            "https://i.dlpng.com/static/png/6646535_preview.png"
        )

        val writerModel2 = WriterModel(
            "İsmail Sözen",
            "sozendev@gmail.com",
            "Bilgisayar Mühendisi",
            "https://pngimage.net/wp-content/uploads/2018/05/avatar-profile-png-2.png"
        )

        val writerList: ArrayList<WriterModel> = ArrayList()

        writerList.add(writerModel)
        writerList.add(writerModel2)
        writerList.add(writerModel)
        writerList.add(writerModel2)
        writerList.add(writerModel)
        writerList.add(writerModel2)
        writerList.add(writerModel)
        writerList.add(writerModel2)
        writerList.add(writerModel)
        writerList.add(writerModel2)


        return writerList
    }


}