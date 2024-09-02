package com.example.amazonprimevideoanasayfasi

import android.media.Image
import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {

    val scrollState = rememberScrollState()

    val büyükresimler = listOf(
        R.drawable.chernobyl,
        R.drawable.lotrtrop,
        R.drawable.friends,
        R.drawable.succession,
        R.drawable.thoseabouttodie,
        R.drawable.tetikci,
        R.drawable.invicible,
        R.drawable.ikramiye
    )

    val seslendirmeli = listOf(
        R.drawable.theoffice,
        R.drawable.thebigbangkucuk,
        R.drawable.successionkucuk,
        R.drawable.mrrobotkucuk,
        R.drawable.genzkucuk,
    )

    val onerilendizi = listOf(
        R.drawable.gameofthrones,
        R.drawable.falloutkucuk,
        R.drawable.thebigbangkucuk,
        R.drawable.mrrobotkucuk,
        R.drawable.theoffice,
        R.drawable.chuckkucuk,
        R.drawable.goodomenskucuk

    )

    val cokizlenenfilmler = listOf(
        R.drawable.lotrikikule,
        R.drawable.lotrkralindonusu,
        R.drawable.scarfacekucuk,
        R.drawable.silbastankucuk,
        R.drawable.casinokucuk,
        R.drawable.zamandaaskkucuk
    )

    val amazonorijinaldikey= listOf(
        R.drawable.batmanpelerinlisavascivertical,
        R.drawable.demirpencevertical,
        R.drawable.theboysvertical,
        R.drawable.thoseabouttodievertical,
        R.drawable.federervertical,
        R.drawable.falloutvertical,
        R.drawable.twdwbvertical,
        R.drawable.hizpesindevertical,
        R.drawable.thezoneofinterestvertical,
        R.drawable.sisuvertical,
    )

    val belgeseller = listOf(
        R.drawable.onechildnation,
        R.drawable.goodnightoppy,
        R.drawable.makeusdream,
        R.drawable.frida
    )



    Scaffold(
        topBar = {
            TopAppBar(colors =TopAppBarDefaults.topAppBarColors(containerColor = Color.Black) ,
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.amazonlogo),
                        contentDescription = "Logo",
                        modifier = Modifier.size(60.dp)
                    )
                },
                actions = {
                    IconButton(onClick = {})
                    {
                    Image(painter = painterResource(id = R.drawable.cihaz_bul_logo), contentDescription = "",modifier = Modifier.size(35.dp))
                    }
                }
            )
        },
        bottomBar =
        {
            BottomAppBar(modifier = Modifier
                .height(70.dp),content = {
                    Row(modifier = Modifier.fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceBetween,verticalAlignment = Alignment.CenterVertically) {
                    NavigationBarItem(selected = true, onClick = { /*TODO*/ },
                        icon = {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.anasayfabuton),
                                    contentDescription = "Anasayfa Butonu",
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.height(4.dp)) // İkon ve etiket arasına boşluk
                                Text(text = "Anasayfa", fontSize = 12.sp, color = Color.Gray)
                            }
                        },
                        label = { }
                    )


                    NavigationBarItem(selected = false, onClick = { /*TODO*/ },
                        icon = {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                            )
                            {
                                Icon(painter = painterResource(id = R.drawable.primelogo),
                                    contentDescription ="Prime Butonu",
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.height(4.dp)) // İkon ve etiket arasına boşluk
                                Text(text = "Prime", fontSize = 12.sp, color = Color.Gray)
                            }
                        },
                        label = {}
                    )

                    NavigationBarItem(selected = false, onClick = { /*TODO*/ },
                        icon = {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                            )
                            {
                                Icon(painter = painterResource(id = R.drawable.indirilenler),
                                    contentDescription ="İndirilenler Butonu",
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.height(4.dp)) // İkon ve etiket arasına boşluk
                                Text(text = "İndirilenler", fontSize = 12.sp, color = Color.Gray)
                            }
                        },
                        label = {}
                    )

                    NavigationBarItem(selected = false, onClick = { /*TODO*/ },
                        icon = {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                            )
                            {
                                Icon(painter = painterResource(id = R.drawable.arama),
                                    contentDescription ="Arama Butonu",
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.height(4.dp)) // İkon ve etiket arasına boşluk
                                Text(text = "Arama", fontSize = 12.sp, color = Color.Gray)
                            }
                        },
                        label = {}
                    )

                    NavigationBarItem(selected = false, onClick = { /*TODO*/ },
                        icon = {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,

                            )
                            {
                                Icon(painter = painterResource(id = R.drawable.banaozelkullanici),
                                    contentDescription ="Bana Özel Butonu",
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.height(4.dp)) // İkon ve etiket arasına boşluk
                                Text(text = "Bana Özel", fontSize = 12.sp, color = Color.Gray)
                            }
                        },
                        label = {}
                    )

                }

            })

        }
    )
    {paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(scrollState)
            .padding(paddingValues), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start)
        {
            Row(modifier = Modifier
                .fillMaxWidth()
                ,verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.Start)
            {
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(start = 15.dp, end = 8.dp, bottom = 5.dp)
                        .width(90.dp)
                        .height(35.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),
                    border = BorderStroke(1.dp, Color.Gray),
                    shape = RoundedCornerShape(50))
                {
                Text(text = "Filmler",fontSize = 12.sp,)
                }

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(start = 5.dp, bottom = 5.dp)
                        .width(105.dp)
                        .height(35.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),
                    border = BorderStroke(1.dp, Color.Gray),
                    shape = RoundedCornerShape(50)
                )
                {
                    Text(text = "TV dizileri",fontSize = 12.sp,)
                }
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(230.dp),
                        shape = RoundedCornerShape(2.dp),

                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = büyükresimler[index]),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }


            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding(top = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),)
            {
                Text(text = "Amazon Orijinal ve Özel İçerikler    >",fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
            }


            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .width(140.dp)
                            .height(200.dp),
                        shape = RoundedCornerShape(6.dp),

                        ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = amazonorijinaldikey[index]),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }


            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding(top = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),)
            {
                Text(text = "Seslendirmeli TV dizileri ve filmler    >",fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp,end =6.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(100.dp),
                        shape = RoundedCornerShape(6.dp),

                        ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = seslendirmeli[index]),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }

            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding(top = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),)
            {
                Text(text = "Önerilen Dizi",fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(100.dp),
                        shape = RoundedCornerShape(6.dp),

                        ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = onerilendizi[index]),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }

            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding(top = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),)
            {
                Text(text = "Belgeseller    >",fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(100.dp),
                        shape = RoundedCornerShape(6.dp),

                        ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = belgeseller[index]),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }

            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding(top = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White),)
            {
                Text(text = "Çok İzlenen Filmler",fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) { index ->
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(100.dp),
                        shape = RoundedCornerShape(6.dp),

                        ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = cokizlenenfilmler[index]),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
            }
        }
    }
}