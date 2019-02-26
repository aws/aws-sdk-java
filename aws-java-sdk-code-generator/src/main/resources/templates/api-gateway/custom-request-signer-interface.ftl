${fileHeader}
<#assign hasPlacement=authorizer.hasTokenPlacement()>
package ${metadata.packageName}.auth;

import javax.annotation.Generated;
<#if hasPlacement>
import com.amazonaws.ImmutableRequest;
import com.amazonaws.SignableRequest;
</#if>
import com.amazonaws.auth.RequestSigner;
import ${metadata.packageName}.${metadata.syncInterface};
import ${metadata.packageName}.${metadata.syncClient}Builder;

/**
<#if hasPlacement>
 * A default implementation of {@link RequestSigner} that puts a generated token into the ${authorizer.authTokenLocation}.
 * An implementation of this can to be supplied during construction of a {@link ${metadata.syncInterface}}
 * via {@link ${metadata.syncClient}Builder#signer(${className})} like so
 *
 * <pre>
 * <code>
 *  ${metadata.syncInterface} client = ${metadata.syncInterface}.builder().signer((${className}) request -> "some token").build();
 * </code>
 * </pre>
<#else>
 * A placeholder extension of {@link RequestSigner} an implementation of which can be supplied during construction
 * of a {@link ${metadata.syncInterface}} via {@link ${metadata.syncClient}Builder#signer(${className})} like so
 *
 * <pre>
 * <code>
 *  ${metadata.syncInterface} client = ${metadata.syncInterface}.builder().signer((${className}) request -> * some mutation of request to sign it * ).build();
 * </code>
 * </pre>
</#if>
 */
@FunctionalInterface
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ${className} extends RequestSigner {

    <#if hasPlacement>
    /**
     * Generate a token that will be added to ${authorizer.tokenName} in the ${authorizer.authTokenLocation}
     * of the request during signing
     * @param request an immutable view of the request for which to generate a token
     * @return the token to use for signing
     */
    String generateToken(ImmutableRequest<?> request);

    /**
     * @see RequestSigner#sign(SignableRequest)
     */
    @Override
    default void sign(SignableRequest<?> request) {
        request.${authorizer.addAuthTokenMethod}("${authorizer.tokenName}", generateToken(request));
    }
    </#if>
}
