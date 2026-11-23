package com.example.praktikum04

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MahasiswaAdapter(
    private val context: Context,
    private val mahasiswaList: List<Mahasiswa>
) : BaseAdapter() {

    override fun getCount(): Int = mahasiswaList.size

    override fun getItem(position: Int): Any = mahasiswaList[position]

    override fun getItemId(position: Int): Long = mahasiswaList[position].id.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_mahasiswa, parent, false)

        val mahasiswa = mahasiswaList[position]

        val tvNama = view.findViewById<TextView>(R.id.tvNama)
        val tvNim = view.findViewById<TextView>(R.id.tvNim)
        val tvJurusan = view.findViewById<TextView>(R.id.tvJurusan)

        tvNama.text = mahasiswa.nama
        tvNim.text = mahasiswa.nim
        tvJurusan.text = mahasiswa.jurusan

        return view
    }
}