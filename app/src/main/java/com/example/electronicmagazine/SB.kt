package com.example.electronicmagazine

import com.google.android.gms.auth.api.Auth
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.postgrest.Postgrest

object SB {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://sbmgpkldkiyrzkgxomxt.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InNibWdwa2xka2l5cnprZ3hvbXh0Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDQwODgzNTgsImV4cCI6MjAxOTY2NDM1OH0.GFdIdtIuJvxya3JbnLJ25rdWUuy2-RgkZgvCbAqu3Wo"
    ) {
        install(GoTrue)
        install(Postgrest)
        //install other modules
    }
    public fun getClient(): SupabaseClient{
        return supabase
    }
}