package com.example.cloverestate.data

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.cloverestate.models.buy
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BuyViewModel:ViewModel() {

    fun savedData(

        buyData: buy,
        context: Context,

        ) = CoroutineScope(Dispatchers.IO).launch {
        val fireStoreRef = Firebase.firestore
            .collection("buy")
            .document(buyData.buyId.toString())
        try {
            fireStoreRef.set(buyData)
                .addOnSuccessListener {
                    Toast.makeText(context, "Toast.LENGTH_SHORT", Toast.LENGTH_SHORT).show()
                }

        } catch (e: Exception) {
            Toast.makeText(context, e.message, Toast.LENGTH_SHORT).show()
        }
    }
}



