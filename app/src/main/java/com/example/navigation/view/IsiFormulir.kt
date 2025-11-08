package com.example.navigation.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

private val DeepOcean   = Color(0xFF0284C7)
private val RoyalViolet = Color(0xFF9333EA)

@Composable
fun Formulir(navController: NavController) {
    var inputNama by remember { mutableStateOf("") }
    var inputAlamat by remember { mutableStateOf("") }

    val opsiJenisKelamin = listOf("Laki-laki", "Perempuan")
    var pilihanJK by remember { mutableStateOf(opsiJenisKelamin[0]) }

    val opsiStatus = listOf("Menikah", "Belum Menikah", "Duda/janda")
    var pilihanStatus by remember { mutableStateOf(opsiStatus[0]) }

    var tampilDialog by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF1E293B),
                        Color(0xFF0F172A)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 24.dp)
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                color = Color(0xFF334155).copy(alpha = 0.5f)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

        }
