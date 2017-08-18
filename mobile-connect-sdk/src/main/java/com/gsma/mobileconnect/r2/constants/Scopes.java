/*
 * SOFTWARE USE PERMISSION
 *
 * By downloading and accessing this software and associated documentation files ("Software") you are granted the
 * unrestricted right to deal in the Software, including, without limitation the right to use, copy, modify, publish,
 * sublicense and grant such rights to third parties, subject to the following conditions:
 *
 * The following copyright notice and this permission notice shall be included in all copies, modifications or
 * substantial portions of this Software: Copyright © 2016 GSM Association.
 *
 * THE SOFTWARE IS PROVIDED "AS IS," WITHOUT WARRANTY OF ANY KIND, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. YOU AGREE TO
 * INDEMNIFY AND HOLD HARMLESS THE AUTHORS AND COPYRIGHT HOLDERS FROM AND AGAINST ANY SUCH LIABILITY.
 */
package com.gsma.mobileconnect.r2.constants;

import com.gsma.mobileconnect.r2.utils.ObjectUtils;

import java.util.*;

/**
 * Constants related to Mobile Connect such as available scope values.
 *
 * @since 2.0
 */
public final class Scopes
{
    /**
     * Default required scope value
     */
    public static final String MOBILECONNECT = "openid";
    /**
     * Scope value for Authentication
     */
    public static final String MOBILECONNECTAUTHENTICATION = "openid mc_authn";
    /**
     * Scope value for Authorization
     */
    public static final String MOBILECONNECTAUTHORIZATION = "openid mc_authz";
    /**
     * Scope value for Identity Phone Number
     */
    public static final String MOBILECONNECTIDENTITYPHONE = "openid mc_identity_phonenumber";
    /**
     * Scope value for Identity Signup
     */
    public static final String MOBILECONNECTIDENTITYSIGNUP = "openid mc_identity_signup";
    /**
     * Scope value for Identity Signup Plus
     */
    public static final String MOBILECONNECTIDENTITYSIGNUPPLUS = "openid mc_identity_signupplus";
    /**
     * Scope value for Identity National ID
     */
    public static final String MOBILECONNECTIDENTITYNATIONALID = "openid mc_identity_nationalid";

    /**
     * Returns a list of scope values that is ensured to contain defaultScope values without
     * duplications.  This can be used when multiple modifications of scope are required to be
     * chained.
     *
     * @param scopeValues  scope to coerce.
     * @param defaultScope required default scope, {@link Scope#OPENID} if null.
     * @return list of scope values containing default scope values and scopeValues with no
     * duplications.
     */
    public static List<String> coerceOpenIdScope(final List<String> scopeValues,
        final String defaultScope)
    {
        final Set<String> splitDefault = new HashSet<String>(
            Arrays.asList(ObjectUtils.defaultIfNull(defaultScope, Scope.OPENID).split("\\s")));
        splitDefault.addAll(scopeValues);
        return new ArrayList<String>(splitDefault);
    }
}
