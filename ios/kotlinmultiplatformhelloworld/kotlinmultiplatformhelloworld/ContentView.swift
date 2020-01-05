//
//  ContentView.swift
//  kotlinmultiplatformhelloworld
//
//  Created by Lavong Soysavanh on 05.01.20.
//  Copyright © 2020 Lavong Soysavanh. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(NameKt.createHelloWorldMessage())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
