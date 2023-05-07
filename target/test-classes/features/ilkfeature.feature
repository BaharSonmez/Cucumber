Feature: US001_Amozon_Sayfasi_Testi
  Scenario: TC01_Amazon_Sayfasinda_Urun_Aratilir
    Given kullanici_amazon_sayfasina_gider
    Then arama_kutusunda_iphone_aratir
    And sayfayi_kapatir
