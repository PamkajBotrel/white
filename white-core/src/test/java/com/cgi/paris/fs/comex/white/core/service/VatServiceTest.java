package com.cgi.paris.fs.comex.white.core.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VatServiceTest {
@Test
    public void computeFrenchVat() {
    final VatService vatService = new VatService();
    assertThat(vatService.computeFrenchVat(1_000)).isEqualTo(200);
}
}