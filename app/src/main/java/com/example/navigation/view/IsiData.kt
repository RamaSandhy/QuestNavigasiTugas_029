package com.example.navigation.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

private val NeonBlue   = Color(0xFF4F46E5)
private val NeonPurple = Color(0xFF7C3AED)

data class Peserta(
    val nama: String,
    val jk: String,
    val status: String,
    val alamat: String
)
@Composable
fun TampilData(navController: NavController) {
    val pesertaList = listOf(
        Peserta("Rama Sandhy Muhammad", "Laki-laki", "Belum Menikah", "Sleman"),
        Peserta("Regan Alisya Anggara", "Laki-laki", "Belum Menikah", "Yogyakarta"),
        Peserta("Ain Yuka Yunanda", "Perempuan", "Belum Menikah", "Bantul")
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF1E3A8A),
                        Color(0xFF7C3AED),
                        Color(0xFFEC4899)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 1000f)
                )
            )
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "Data Peserta",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

            items(pesertaList) { peserta ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(12.dp, RoundedCornerShape(16.dp)),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF8FAFC)
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {

                    }





