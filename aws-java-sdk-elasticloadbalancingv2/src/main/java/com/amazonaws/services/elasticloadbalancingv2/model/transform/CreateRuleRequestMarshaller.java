/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateRuleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequestMarshaller implements Marshaller<Request<CreateRuleRequest>, CreateRuleRequest> {

    public Request<CreateRuleRequest> marshall(CreateRuleRequest createRuleRequest) {

        if (createRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRuleRequest> request = new DefaultRequest<CreateRuleRequest>(createRuleRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateRule");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRuleRequest.getListenerArn() != null) {
            request.addParameter("ListenerArn", StringUtils.fromString(createRuleRequest.getListenerArn()));
        }

        if (createRuleRequest.getConditions() != null) {
            java.util.List<RuleCondition> conditionsList = createRuleRequest.getConditions();
            if (conditionsList.isEmpty()) {
                request.addParameter("Conditions", "");
            } else {
                int conditionsListIndex = 1;

                for (RuleCondition conditionsListValue : conditionsList) {

                    if (conditionsListValue.getField() != null) {
                        request.addParameter("Conditions.member." + conditionsListIndex + ".Field", StringUtils.fromString(conditionsListValue.getField()));
                    }

                    if (conditionsListValue.getValues() != null) {
                        java.util.List<String> valuesList = conditionsListValue.getValues();
                        if (valuesList.isEmpty()) {
                            request.addParameter("Conditions.member." + conditionsListIndex + ".Values", "");
                        } else {
                            int valuesListIndex = 1;

                            for (String valuesListValue : valuesList) {
                                if (valuesListValue != null) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".Values.member." + valuesListIndex,
                                            StringUtils.fromString(valuesListValue));
                                }
                                valuesListIndex++;
                            }
                        }
                    }

                    {
                        HostHeaderConditionConfig hostHeaderConfig = conditionsListValue.getHostHeaderConfig();
                        if (hostHeaderConfig != null) {

                            if (hostHeaderConfig.getValues() != null) {
                                java.util.List<String> valuesList = hostHeaderConfig.getValues();
                                if (valuesList.isEmpty()) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".HostHeaderConfig.Values", "");
                                } else {
                                    int valuesListIndex = 1;

                                    for (String valuesListValue : valuesList) {
                                        if (valuesListValue != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".HostHeaderConfig.Values.member."
                                                    + valuesListIndex, StringUtils.fromString(valuesListValue));
                                        }
                                        valuesListIndex++;
                                    }
                                }
                            }
                        }
                    }

                    {
                        PathPatternConditionConfig pathPatternConfig = conditionsListValue.getPathPatternConfig();
                        if (pathPatternConfig != null) {

                            if (pathPatternConfig.getValues() != null) {
                                java.util.List<String> valuesList = pathPatternConfig.getValues();
                                if (valuesList.isEmpty()) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".PathPatternConfig.Values", "");
                                } else {
                                    int valuesListIndex = 1;

                                    for (String valuesListValue : valuesList) {
                                        if (valuesListValue != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".PathPatternConfig.Values.member."
                                                    + valuesListIndex, StringUtils.fromString(valuesListValue));
                                        }
                                        valuesListIndex++;
                                    }
                                }
                            }
                        }
                    }

                    {
                        HttpHeaderConditionConfig httpHeaderConfig = conditionsListValue.getHttpHeaderConfig();
                        if (httpHeaderConfig != null) {

                            if (httpHeaderConfig.getHttpHeaderName() != null) {
                                request.addParameter("Conditions.member." + conditionsListIndex + ".HttpHeaderConfig.HttpHeaderName",
                                        StringUtils.fromString(httpHeaderConfig.getHttpHeaderName()));
                            }

                            if (httpHeaderConfig.getValues() != null) {
                                java.util.List<String> valuesList = httpHeaderConfig.getValues();
                                if (valuesList.isEmpty()) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".HttpHeaderConfig.Values", "");
                                } else {
                                    int valuesListIndex = 1;

                                    for (String valuesListValue : valuesList) {
                                        if (valuesListValue != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".HttpHeaderConfig.Values.member."
                                                    + valuesListIndex, StringUtils.fromString(valuesListValue));
                                        }
                                        valuesListIndex++;
                                    }
                                }
                            }
                        }
                    }

                    {
                        QueryStringConditionConfig queryStringConfig = conditionsListValue.getQueryStringConfig();
                        if (queryStringConfig != null) {

                            if (queryStringConfig.getValues() != null) {
                                java.util.List<QueryStringKeyValuePair> valuesList = queryStringConfig.getValues();
                                if (valuesList.isEmpty()) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".QueryStringConfig.Values", "");
                                } else {
                                    int valuesListIndex = 1;

                                    for (QueryStringKeyValuePair valuesListValue : valuesList) {

                                        if (valuesListValue.getKey() != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".QueryStringConfig.Values.member."
                                                    + valuesListIndex + ".Key", StringUtils.fromString(valuesListValue.getKey()));
                                        }

                                        if (valuesListValue.getValue() != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".QueryStringConfig.Values.member."
                                                    + valuesListIndex + ".Value", StringUtils.fromString(valuesListValue.getValue()));
                                        }
                                        valuesListIndex++;
                                    }
                                }
                            }
                        }
                    }

                    {
                        HttpRequestMethodConditionConfig httpRequestMethodConfig = conditionsListValue.getHttpRequestMethodConfig();
                        if (httpRequestMethodConfig != null) {

                            if (httpRequestMethodConfig.getValues() != null) {
                                java.util.List<String> valuesList = httpRequestMethodConfig.getValues();
                                if (valuesList.isEmpty()) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".HttpRequestMethodConfig.Values", "");
                                } else {
                                    int valuesListIndex = 1;

                                    for (String valuesListValue : valuesList) {
                                        if (valuesListValue != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".HttpRequestMethodConfig.Values.member."
                                                    + valuesListIndex, StringUtils.fromString(valuesListValue));
                                        }
                                        valuesListIndex++;
                                    }
                                }
                            }
                        }
                    }

                    {
                        SourceIpConditionConfig sourceIpConfig = conditionsListValue.getSourceIpConfig();
                        if (sourceIpConfig != null) {

                            if (sourceIpConfig.getValues() != null) {
                                java.util.List<String> valuesList = sourceIpConfig.getValues();
                                if (valuesList.isEmpty()) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".SourceIpConfig.Values", "");
                                } else {
                                    int valuesListIndex = 1;

                                    for (String valuesListValue : valuesList) {
                                        if (valuesListValue != null) {
                                            request.addParameter("Conditions.member." + conditionsListIndex + ".SourceIpConfig.Values.member."
                                                    + valuesListIndex, StringUtils.fromString(valuesListValue));
                                        }
                                        valuesListIndex++;
                                    }
                                }
                            }
                        }
                    }
                    conditionsListIndex++;
                }
            }
        }

        if (createRuleRequest.getPriority() != null) {
            request.addParameter("Priority", StringUtils.fromInteger(createRuleRequest.getPriority()));
        }

        if (createRuleRequest.getActions() != null) {
            java.util.List<Action> actionsList = createRuleRequest.getActions();
            if (actionsList.isEmpty()) {
                request.addParameter("Actions", "");
            } else {
                int actionsListIndex = 1;

                for (Action actionsListValue : actionsList) {

                    if (actionsListValue.getType() != null) {
                        request.addParameter("Actions.member." + actionsListIndex + ".Type", StringUtils.fromString(actionsListValue.getType()));
                    }

                    if (actionsListValue.getTargetGroupArn() != null) {
                        request.addParameter("Actions.member." + actionsListIndex + ".TargetGroupArn",
                                StringUtils.fromString(actionsListValue.getTargetGroupArn()));
                    }

                    {
                        AuthenticateOidcActionConfig authenticateOidcConfig = actionsListValue.getAuthenticateOidcConfig();
                        if (authenticateOidcConfig != null) {

                            if (authenticateOidcConfig.getIssuer() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.Issuer",
                                        StringUtils.fromString(authenticateOidcConfig.getIssuer()));
                            }

                            if (authenticateOidcConfig.getAuthorizationEndpoint() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.AuthorizationEndpoint",
                                        StringUtils.fromString(authenticateOidcConfig.getAuthorizationEndpoint()));
                            }

                            if (authenticateOidcConfig.getTokenEndpoint() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.TokenEndpoint",
                                        StringUtils.fromString(authenticateOidcConfig.getTokenEndpoint()));
                            }

                            if (authenticateOidcConfig.getUserInfoEndpoint() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.UserInfoEndpoint",
                                        StringUtils.fromString(authenticateOidcConfig.getUserInfoEndpoint()));
                            }

                            if (authenticateOidcConfig.getClientId() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.ClientId",
                                        StringUtils.fromString(authenticateOidcConfig.getClientId()));
                            }

                            if (authenticateOidcConfig.getClientSecret() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.ClientSecret",
                                        StringUtils.fromString(authenticateOidcConfig.getClientSecret()));
                            }

                            if (authenticateOidcConfig.getSessionCookieName() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.SessionCookieName",
                                        StringUtils.fromString(authenticateOidcConfig.getSessionCookieName()));
                            }

                            if (authenticateOidcConfig.getScope() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.Scope",
                                        StringUtils.fromString(authenticateOidcConfig.getScope()));
                            }

                            if (authenticateOidcConfig.getSessionTimeout() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.SessionTimeout",
                                        StringUtils.fromLong(authenticateOidcConfig.getSessionTimeout()));
                            }

                            java.util.Map<String, String> authenticationRequestExtraParams = authenticateOidcConfig.getAuthenticationRequestExtraParams();
                            if (authenticationRequestExtraParams != null) {
                                int authenticationRequestExtraParamsListIndex = 1;
                                for (Map.Entry<String, String> entry : authenticationRequestExtraParams.entrySet()) {
                                    if (entry.getKey() != null) {
                                        request.addParameter("Actions.member." + actionsListIndex
                                                + ".AuthenticateOidcConfig.AuthenticationRequestExtraParams.entry." + authenticationRequestExtraParamsListIndex
                                                + ".key", StringUtils.fromString(entry.getKey()));
                                    }
                                    if (entry.getValue() != null) {
                                        request.addParameter("Actions.member." + actionsListIndex
                                                + ".AuthenticateOidcConfig.AuthenticationRequestExtraParams.entry." + authenticationRequestExtraParamsListIndex
                                                + ".value", StringUtils.fromString(entry.getValue()));
                                    }
                                    authenticationRequestExtraParamsListIndex++;
                                }
                            }

                            if (authenticateOidcConfig.getOnUnauthenticatedRequest() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.OnUnauthenticatedRequest",
                                        StringUtils.fromString(authenticateOidcConfig.getOnUnauthenticatedRequest()));
                            }

                            if (authenticateOidcConfig.getUseExistingClientSecret() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateOidcConfig.UseExistingClientSecret",
                                        StringUtils.fromBoolean(authenticateOidcConfig.getUseExistingClientSecret()));
                            }
                        }
                    }

                    {
                        AuthenticateCognitoActionConfig authenticateCognitoConfig = actionsListValue.getAuthenticateCognitoConfig();
                        if (authenticateCognitoConfig != null) {

                            if (authenticateCognitoConfig.getUserPoolArn() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.UserPoolArn",
                                        StringUtils.fromString(authenticateCognitoConfig.getUserPoolArn()));
                            }

                            if (authenticateCognitoConfig.getUserPoolClientId() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.UserPoolClientId",
                                        StringUtils.fromString(authenticateCognitoConfig.getUserPoolClientId()));
                            }

                            if (authenticateCognitoConfig.getUserPoolDomain() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.UserPoolDomain",
                                        StringUtils.fromString(authenticateCognitoConfig.getUserPoolDomain()));
                            }

                            if (authenticateCognitoConfig.getSessionCookieName() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.SessionCookieName",
                                        StringUtils.fromString(authenticateCognitoConfig.getSessionCookieName()));
                            }

                            if (authenticateCognitoConfig.getScope() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.Scope",
                                        StringUtils.fromString(authenticateCognitoConfig.getScope()));
                            }

                            if (authenticateCognitoConfig.getSessionTimeout() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.SessionTimeout",
                                        StringUtils.fromLong(authenticateCognitoConfig.getSessionTimeout()));
                            }

                            java.util.Map<String, String> authenticationRequestExtraParams = authenticateCognitoConfig.getAuthenticationRequestExtraParams();
                            if (authenticationRequestExtraParams != null) {
                                int authenticationRequestExtraParamsListIndex = 1;
                                for (Map.Entry<String, String> entry : authenticationRequestExtraParams.entrySet()) {
                                    if (entry.getKey() != null) {
                                        request.addParameter("Actions.member." + actionsListIndex
                                                + ".AuthenticateCognitoConfig.AuthenticationRequestExtraParams.entry."
                                                + authenticationRequestExtraParamsListIndex + ".key", StringUtils.fromString(entry.getKey()));
                                    }
                                    if (entry.getValue() != null) {
                                        request.addParameter("Actions.member." + actionsListIndex
                                                + ".AuthenticateCognitoConfig.AuthenticationRequestExtraParams.entry."
                                                + authenticationRequestExtraParamsListIndex + ".value", StringUtils.fromString(entry.getValue()));
                                    }
                                    authenticationRequestExtraParamsListIndex++;
                                }
                            }

                            if (authenticateCognitoConfig.getOnUnauthenticatedRequest() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".AuthenticateCognitoConfig.OnUnauthenticatedRequest",
                                        StringUtils.fromString(authenticateCognitoConfig.getOnUnauthenticatedRequest()));
                            }
                        }
                    }

                    if (actionsListValue.getOrder() != null) {
                        request.addParameter("Actions.member." + actionsListIndex + ".Order", StringUtils.fromInteger(actionsListValue.getOrder()));
                    }

                    {
                        RedirectActionConfig redirectConfig = actionsListValue.getRedirectConfig();
                        if (redirectConfig != null) {

                            if (redirectConfig.getProtocol() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".RedirectConfig.Protocol",
                                        StringUtils.fromString(redirectConfig.getProtocol()));
                            }

                            if (redirectConfig.getPort() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".RedirectConfig.Port",
                                        StringUtils.fromString(redirectConfig.getPort()));
                            }

                            if (redirectConfig.getHost() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".RedirectConfig.Host",
                                        StringUtils.fromString(redirectConfig.getHost()));
                            }

                            if (redirectConfig.getPath() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".RedirectConfig.Path",
                                        StringUtils.fromString(redirectConfig.getPath()));
                            }

                            if (redirectConfig.getQuery() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".RedirectConfig.Query",
                                        StringUtils.fromString(redirectConfig.getQuery()));
                            }

                            if (redirectConfig.getStatusCode() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".RedirectConfig.StatusCode",
                                        StringUtils.fromString(redirectConfig.getStatusCode()));
                            }
                        }
                    }

                    {
                        FixedResponseActionConfig fixedResponseConfig = actionsListValue.getFixedResponseConfig();
                        if (fixedResponseConfig != null) {

                            if (fixedResponseConfig.getMessageBody() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".FixedResponseConfig.MessageBody",
                                        StringUtils.fromString(fixedResponseConfig.getMessageBody()));
                            }

                            if (fixedResponseConfig.getStatusCode() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".FixedResponseConfig.StatusCode",
                                        StringUtils.fromString(fixedResponseConfig.getStatusCode()));
                            }

                            if (fixedResponseConfig.getContentType() != null) {
                                request.addParameter("Actions.member." + actionsListIndex + ".FixedResponseConfig.ContentType",
                                        StringUtils.fromString(fixedResponseConfig.getContentType()));
                            }
                        }
                    }
                    actionsListIndex++;
                }
            }
        }

        return request;
    }

}
