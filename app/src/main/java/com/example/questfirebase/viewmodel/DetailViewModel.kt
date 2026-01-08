package com.example.questfirebase.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questfirebase.modeldata.Siswa
import com.example.questfirebase.repositori.RepositorySiswa
import com.example.questfirebase.view.route.DestinasiDetail
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object loading : StatusUIDetail
}
