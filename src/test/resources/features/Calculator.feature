Feature: Calculator Samsung

  Scenario: Hitung Penjumlahan Sederhana
    Given saya menekan tombol clear
    And saya menekan tombol nilai pertama
    And saya menekan tombol plus
    And saya menekan tombol nilai kedua
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil "14"

  Scenario: Menjumlahkan 10 dan 20 dengan data driven test
    Given saya menekan tombol clear
    And saya menekan tombol nilai "10"
    And saya menekan tombol plus
    And saya menekan tombol nilai "20"
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil "30"

  Scenario: Menjumlahkan 200 dan 30 dengan data driven test
    Given saya menekan tombol clear
    And saya menekan tombol nilai "200"
    And saya menekan tombol plus
    And saya menekan tombol nilai "30"
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil "230"