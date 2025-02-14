Feature: Calculator Samsung

  Scenario: Hitung Penjumlahan Sederhana
    Given saya menekan tombol clear
    And saya menekan tombol nilai pertama
    And saya menekan tombol plus
    And saya menekan tombol nilai kedua
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil "14"

  Scenario Outline: Menjumlahkan dengan data driven test
    Given saya menekan tombol clear
    And saya menekan tombol nilai "<val1>"
    And saya menekan tombol plus
    And saya menekan tombol nilai "<val2>"
    When saya menekan tombol sama dengan
    Then saya mendapatkan hasil "<result>"

    Examples:
      | val1 | val2 | result |
      |  10  |  20  |   30   |
      |  200 |  30  |   230  |