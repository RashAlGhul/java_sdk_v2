package com.gsma.mobileconnect.r2.discovery;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URI;

import static org.testng.Assert.*;

public class DiscoveryOptionsTest
{
    private DiscoveryOptions discoveryOptions;
    private URI uri;

    @BeforeMethod
    public void setUp() throws Exception
    {
        uri = new URI("http://redirect");
        discoveryOptions = new DiscoveryOptions.Builder(null)
                .withIdentifiedMnc("iMnc")
                .withSelectedMcc("sMcc")
                .withSelectedMnc("sMnc")
                .withClientIp("clientIp")
                .withIdentifiedMcc("iMcc")
                .withLocalClientIp("localClientIp")
                .withManuallySelect(true)
                .withMsisdn("msisdn")
                .withRedirectUrl(uri)
                .withUsingMobileData(false)
                .withXRedirect("XRedirect")
                .withUsingCorrelationId(true)
                .build();
    }
    public void tearDown() throws Exception
    {
        uri = null;
        discoveryOptions = null;
    }

    @AfterMethod

    @Test
    public void testGetMsisdn() throws Exception
    {
        assertEquals(discoveryOptions.getMsisdn(), "msisdn");
    }

    @Test
    public void testGetRedirectUrl() throws Exception
    {
        assertEquals(discoveryOptions.getRedirectUrl(), uri);
    }

    @Test
    public void testIsManuallySelect() throws Exception
    {
        assertTrue(discoveryOptions.isManuallySelect());
    }

    @Test
    public void testGetIdentifiedMcc() throws Exception
    {
        assertEquals(discoveryOptions.getIdentifiedMcc(), "iMcc");
    }

    @Test
    public void testGetIdentifiedMnc() throws Exception
    {
        assertEquals(discoveryOptions.getIdentifiedMnc(), "iMnc");
    }

    @Test
    public void testGetSelectedMcc() throws Exception
    {
        assertEquals(discoveryOptions.getSelectedMcc(), "sMcc");
    }

    @Test
    public void testGetSelectedMnc() throws Exception
    {
        assertEquals(discoveryOptions.getSelectedMnc(), "sMnc");
    }

    @Test
    public void testIsUsingMobileData() throws Exception
    {
        assertFalse(discoveryOptions.isUsingMobileData());
    }

    @Test
    public void testGetLocalClientIp() throws Exception
    {
        assertEquals(discoveryOptions.getLocalClientIp(), "localClientIp");
    }

    @Test
    public void testGetClientIp() throws Exception
    {
        assertEquals(discoveryOptions.getClientIp(), "clientIp");
    }

    @Test
    public void testGetXRedirect() throws Exception
    {
        assertEquals(discoveryOptions.getXRedirect(), "XRedirect");
    }

    @Test
    public void testGetUsingCorrelationId() throws Exception
    {
        assertTrue(discoveryOptions.getUsingCorrelationId());
    }
}