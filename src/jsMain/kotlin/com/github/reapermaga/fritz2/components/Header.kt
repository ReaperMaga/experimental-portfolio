package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext

fun RenderContext.header() {
    header("flex justify-between w-full mx-auto mt-28 px-10") {
        div("w-1/2 flex justify-center flex-col") {
            h1("text-4xl font-bold") {
                +"Hello, my name is "
                span("text-primary") {
                    +"Maga"
                }
            }
            p("mt-4 text-gray-400 text-xl") {
                +"Hi! I’m a full-stack developer. I’m really good at backend stuff, but I can do frontend too. I like building things that work well and making sure everything runs smoothly."
            }
            div("flex mt-6 gap-6") {
                customButton("Read more...", ButtonType.PRIMARY)
                customButton("View my projects", ButtonType.SECONDARY)
            }
        }
        div("flex flex-col items-end") {
            profileImage()
            div("w-full flex gap-4 justify-center mt-3") {
                socialIcon(
                    "ph:github-logo-fill",
                    iconClasses = "text-xl bg-slate-600 p-2 rounded-full opacity-80 hover:opacity-100",
                    href = "https://github.com/reapermaga")
                socialIcon(
                    "ph:twitter-logo-fill",
                    iconClasses = "text-xl bg-blue-500 p-2 rounded-full opacity-80 hover:opacity-100",
                    href = "https://twitter.com/reaper_maga")
            }
        }

    }
}