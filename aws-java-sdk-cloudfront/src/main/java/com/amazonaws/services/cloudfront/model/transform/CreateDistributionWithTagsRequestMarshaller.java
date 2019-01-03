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
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;

import com.amazonaws.util.XMLWriter;

/**
 * CreateDistributionWithTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDistributionWithTagsRequestMarshaller implements Marshaller<Request<CreateDistributionWithTagsRequest>, CreateDistributionWithTagsRequest> {

    public Request<CreateDistributionWithTagsRequest> marshall(CreateDistributionWithTagsRequest createDistributionWithTagsRequest) {

        if (createDistributionWithTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDistributionWithTagsRequest> request = new DefaultRequest<CreateDistributionWithTagsRequest>(createDistributionWithTagsRequest,
                "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2018-11-05/distribution?WithTags";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2018-11-05/");

            DistributionConfigWithTags distributionConfigWithTags = createDistributionWithTagsRequest.getDistributionConfigWithTags();
            if (distributionConfigWithTags != null) {
                xmlWriter.startElement("DistributionConfigWithTags");

                DistributionConfig distributionConfig = distributionConfigWithTags.getDistributionConfig();
                if (distributionConfig != null) {
                    xmlWriter.startElement("DistributionConfig");

                    if (distributionConfig.getCallerReference() != null) {
                        xmlWriter.startElement("CallerReference").value(distributionConfig.getCallerReference()).endElement();
                    }

                    Aliases aliases = distributionConfig.getAliases();
                    if (aliases != null) {
                        xmlWriter.startElement("Aliases");

                        if (aliases.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(aliases.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<String> aliasesItemsList = (com.amazonaws.internal.SdkInternalList<String>) aliases.getItems();
                        if (!aliasesItemsList.isEmpty() || !aliasesItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (String aliasesItemsListValue : aliasesItemsList) {
                                xmlWriter.startElement("CNAME");
                                xmlWriter.value(aliasesItemsListValue);
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (distributionConfig.getDefaultRootObject() != null) {
                        xmlWriter.startElement("DefaultRootObject").value(distributionConfig.getDefaultRootObject()).endElement();
                    }

                    Origins origins = distributionConfig.getOrigins();
                    if (origins != null) {
                        xmlWriter.startElement("Origins");

                        if (origins.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(origins.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<Origin> originsItemsList = (com.amazonaws.internal.SdkInternalList<Origin>) origins.getItems();
                        if (!originsItemsList.isEmpty() || !originsItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (Origin originsItemsListValue : originsItemsList) {
                                xmlWriter.startElement("Origin");

                                if (originsItemsListValue.getId() != null) {
                                    xmlWriter.startElement("Id").value(originsItemsListValue.getId()).endElement();
                                }

                                if (originsItemsListValue.getDomainName() != null) {
                                    xmlWriter.startElement("DomainName").value(originsItemsListValue.getDomainName()).endElement();
                                }

                                if (originsItemsListValue.getOriginPath() != null) {
                                    xmlWriter.startElement("OriginPath").value(originsItemsListValue.getOriginPath()).endElement();
                                }

                                CustomHeaders customHeaders = originsItemsListValue.getCustomHeaders();
                                if (customHeaders != null) {
                                    xmlWriter.startElement("CustomHeaders");

                                    if (customHeaders.getQuantity() != null) {
                                        xmlWriter.startElement("Quantity").value(customHeaders.getQuantity()).endElement();
                                    }

                                    com.amazonaws.internal.SdkInternalList<OriginCustomHeader> customHeadersItemsList = (com.amazonaws.internal.SdkInternalList<OriginCustomHeader>) customHeaders
                                            .getItems();
                                    if (!customHeadersItemsList.isEmpty() || !customHeadersItemsList.isAutoConstruct()) {
                                        xmlWriter.startElement("Items");

                                        for (OriginCustomHeader customHeadersItemsListValue : customHeadersItemsList) {
                                            xmlWriter.startElement("OriginCustomHeader");

                                            if (customHeadersItemsListValue.getHeaderName() != null) {
                                                xmlWriter.startElement("HeaderName").value(customHeadersItemsListValue.getHeaderName()).endElement();
                                            }

                                            if (customHeadersItemsListValue.getHeaderValue() != null) {
                                                xmlWriter.startElement("HeaderValue").value(customHeadersItemsListValue.getHeaderValue()).endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                S3OriginConfig s3OriginConfig = originsItemsListValue.getS3OriginConfig();
                                if (s3OriginConfig != null) {
                                    xmlWriter.startElement("S3OriginConfig");

                                    if (s3OriginConfig.getOriginAccessIdentity() != null) {
                                        xmlWriter.startElement("OriginAccessIdentity").value(s3OriginConfig.getOriginAccessIdentity()).endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                CustomOriginConfig customOriginConfig = originsItemsListValue.getCustomOriginConfig();
                                if (customOriginConfig != null) {
                                    xmlWriter.startElement("CustomOriginConfig");

                                    if (customOriginConfig.getHTTPPort() != null) {
                                        xmlWriter.startElement("HTTPPort").value(customOriginConfig.getHTTPPort()).endElement();
                                    }

                                    if (customOriginConfig.getHTTPSPort() != null) {
                                        xmlWriter.startElement("HTTPSPort").value(customOriginConfig.getHTTPSPort()).endElement();
                                    }

                                    if (customOriginConfig.getOriginProtocolPolicy() != null) {
                                        xmlWriter.startElement("OriginProtocolPolicy").value(customOriginConfig.getOriginProtocolPolicy()).endElement();
                                    }

                                    OriginSslProtocols originSslProtocols = customOriginConfig.getOriginSslProtocols();
                                    if (originSslProtocols != null) {
                                        xmlWriter.startElement("OriginSslProtocols");

                                        if (originSslProtocols.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(originSslProtocols.getQuantity()).endElement();
                                        }

                                        com.amazonaws.internal.SdkInternalList<String> originSslProtocolsItemsList = (com.amazonaws.internal.SdkInternalList<String>) originSslProtocols
                                                .getItems();
                                        if (!originSslProtocolsItemsList.isEmpty() || !originSslProtocolsItemsList.isAutoConstruct()) {
                                            xmlWriter.startElement("Items");

                                            for (String originSslProtocolsItemsListValue : originSslProtocolsItemsList) {
                                                xmlWriter.startElement("SslProtocol");
                                                xmlWriter.value(originSslProtocolsItemsListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }

                                    if (customOriginConfig.getOriginReadTimeout() != null) {
                                        xmlWriter.startElement("OriginReadTimeout").value(customOriginConfig.getOriginReadTimeout()).endElement();
                                    }

                                    if (customOriginConfig.getOriginKeepaliveTimeout() != null) {
                                        xmlWriter.startElement("OriginKeepaliveTimeout").value(customOriginConfig.getOriginKeepaliveTimeout()).endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    OriginGroups originGroups = distributionConfig.getOriginGroups();
                    if (originGroups != null) {
                        xmlWriter.startElement("OriginGroups");

                        if (originGroups.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(originGroups.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<OriginGroup> originGroupsItemsList = (com.amazonaws.internal.SdkInternalList<OriginGroup>) originGroups
                                .getItems();
                        if (!originGroupsItemsList.isEmpty() || !originGroupsItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (OriginGroup originGroupsItemsListValue : originGroupsItemsList) {
                                xmlWriter.startElement("OriginGroup");

                                if (originGroupsItemsListValue.getId() != null) {
                                    xmlWriter.startElement("Id").value(originGroupsItemsListValue.getId()).endElement();
                                }

                                OriginGroupFailoverCriteria failoverCriteria = originGroupsItemsListValue.getFailoverCriteria();
                                if (failoverCriteria != null) {
                                    xmlWriter.startElement("FailoverCriteria");

                                    StatusCodes statusCodes = failoverCriteria.getStatusCodes();
                                    if (statusCodes != null) {
                                        xmlWriter.startElement("StatusCodes");

                                        if (statusCodes.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(statusCodes.getQuantity()).endElement();
                                        }

                                        com.amazonaws.internal.SdkInternalList<Integer> statusCodesItemsList = (com.amazonaws.internal.SdkInternalList<Integer>) statusCodes
                                                .getItems();
                                        if (!statusCodesItemsList.isEmpty() || !statusCodesItemsList.isAutoConstruct()) {
                                            xmlWriter.startElement("Items");

                                            for (Integer statusCodesItemsListValue : statusCodesItemsList) {
                                                xmlWriter.startElement("StatusCode");
                                                xmlWriter.value(statusCodesItemsListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                OriginGroupMembers members = originGroupsItemsListValue.getMembers();
                                if (members != null) {
                                    xmlWriter.startElement("Members");

                                    if (members.getQuantity() != null) {
                                        xmlWriter.startElement("Quantity").value(members.getQuantity()).endElement();
                                    }

                                    com.amazonaws.internal.SdkInternalList<OriginGroupMember> originGroupMembersItemsList = (com.amazonaws.internal.SdkInternalList<OriginGroupMember>) members
                                            .getItems();
                                    if (!originGroupMembersItemsList.isEmpty() || !originGroupMembersItemsList.isAutoConstruct()) {
                                        xmlWriter.startElement("Items");

                                        for (OriginGroupMember originGroupMembersItemsListValue : originGroupMembersItemsList) {
                                            xmlWriter.startElement("OriginGroupMember");

                                            if (originGroupMembersItemsListValue.getOriginId() != null) {
                                                xmlWriter.startElement("OriginId").value(originGroupMembersItemsListValue.getOriginId()).endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    DefaultCacheBehavior defaultCacheBehavior = distributionConfig.getDefaultCacheBehavior();
                    if (defaultCacheBehavior != null) {
                        xmlWriter.startElement("DefaultCacheBehavior");

                        if (defaultCacheBehavior.getTargetOriginId() != null) {
                            xmlWriter.startElement("TargetOriginId").value(defaultCacheBehavior.getTargetOriginId()).endElement();
                        }

                        ForwardedValues forwardedValues = defaultCacheBehavior.getForwardedValues();
                        if (forwardedValues != null) {
                            xmlWriter.startElement("ForwardedValues");

                            if (forwardedValues.getQueryString() != null) {
                                xmlWriter.startElement("QueryString").value(forwardedValues.getQueryString()).endElement();
                            }

                            CookiePreference cookies = forwardedValues.getCookies();
                            if (cookies != null) {
                                xmlWriter.startElement("Cookies");

                                if (cookies.getForward() != null) {
                                    xmlWriter.startElement("Forward").value(cookies.getForward()).endElement();
                                }

                                CookieNames whitelistedNames = cookies.getWhitelistedNames();
                                if (whitelistedNames != null) {
                                    xmlWriter.startElement("WhitelistedNames");

                                    if (whitelistedNames.getQuantity() != null) {
                                        xmlWriter.startElement("Quantity").value(whitelistedNames.getQuantity()).endElement();
                                    }

                                    com.amazonaws.internal.SdkInternalList<String> cookieNamesItemsList = (com.amazonaws.internal.SdkInternalList<String>) whitelistedNames
                                            .getItems();
                                    if (!cookieNamesItemsList.isEmpty() || !cookieNamesItemsList.isAutoConstruct()) {
                                        xmlWriter.startElement("Items");

                                        for (String cookieNamesItemsListValue : cookieNamesItemsList) {
                                            xmlWriter.startElement("Name");
                                            xmlWriter.value(cookieNamesItemsListValue);
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }

                            Headers headers = forwardedValues.getHeaders();
                            if (headers != null) {
                                xmlWriter.startElement("Headers");

                                if (headers.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(headers.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> headersItemsList = (com.amazonaws.internal.SdkInternalList<String>) headers
                                        .getItems();
                                if (!headersItemsList.isEmpty() || !headersItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String headersItemsListValue : headersItemsList) {
                                        xmlWriter.startElement("Name");
                                        xmlWriter.value(headersItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }

                            QueryStringCacheKeys queryStringCacheKeys = forwardedValues.getQueryStringCacheKeys();
                            if (queryStringCacheKeys != null) {
                                xmlWriter.startElement("QueryStringCacheKeys");

                                if (queryStringCacheKeys.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(queryStringCacheKeys.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> queryStringCacheKeysItemsList = (com.amazonaws.internal.SdkInternalList<String>) queryStringCacheKeys
                                        .getItems();
                                if (!queryStringCacheKeysItemsList.isEmpty() || !queryStringCacheKeysItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String queryStringCacheKeysItemsListValue : queryStringCacheKeysItemsList) {
                                        xmlWriter.startElement("Name");
                                        xmlWriter.value(queryStringCacheKeysItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        TrustedSigners trustedSigners = defaultCacheBehavior.getTrustedSigners();
                        if (trustedSigners != null) {
                            xmlWriter.startElement("TrustedSigners");

                            if (trustedSigners.getEnabled() != null) {
                                xmlWriter.startElement("Enabled").value(trustedSigners.getEnabled()).endElement();
                            }

                            if (trustedSigners.getQuantity() != null) {
                                xmlWriter.startElement("Quantity").value(trustedSigners.getQuantity()).endElement();
                            }

                            com.amazonaws.internal.SdkInternalList<String> trustedSignersItemsList = (com.amazonaws.internal.SdkInternalList<String>) trustedSigners
                                    .getItems();
                            if (!trustedSignersItemsList.isEmpty() || !trustedSignersItemsList.isAutoConstruct()) {
                                xmlWriter.startElement("Items");

                                for (String trustedSignersItemsListValue : trustedSignersItemsList) {
                                    xmlWriter.startElement("AwsAccountNumber");
                                    xmlWriter.value(trustedSignersItemsListValue);
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        if (defaultCacheBehavior.getViewerProtocolPolicy() != null) {
                            xmlWriter.startElement("ViewerProtocolPolicy").value(defaultCacheBehavior.getViewerProtocolPolicy()).endElement();
                        }

                        if (defaultCacheBehavior.getMinTTL() != null) {
                            xmlWriter.startElement("MinTTL").value(defaultCacheBehavior.getMinTTL()).endElement();
                        }

                        AllowedMethods allowedMethods = defaultCacheBehavior.getAllowedMethods();
                        if (allowedMethods != null) {
                            xmlWriter.startElement("AllowedMethods");

                            if (allowedMethods.getQuantity() != null) {
                                xmlWriter.startElement("Quantity").value(allowedMethods.getQuantity()).endElement();
                            }

                            com.amazonaws.internal.SdkInternalList<String> allowedMethodsItemsList = (com.amazonaws.internal.SdkInternalList<String>) allowedMethods
                                    .getItems();
                            if (!allowedMethodsItemsList.isEmpty() || !allowedMethodsItemsList.isAutoConstruct()) {
                                xmlWriter.startElement("Items");

                                for (String allowedMethodsItemsListValue : allowedMethodsItemsList) {
                                    xmlWriter.startElement("Method");
                                    xmlWriter.value(allowedMethodsItemsListValue);
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }

                            CachedMethods cachedMethods = allowedMethods.getCachedMethods();
                            if (cachedMethods != null) {
                                xmlWriter.startElement("CachedMethods");

                                if (cachedMethods.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(cachedMethods.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> cachedMethodsItemsList = (com.amazonaws.internal.SdkInternalList<String>) cachedMethods
                                        .getItems();
                                if (!cachedMethodsItemsList.isEmpty() || !cachedMethodsItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String cachedMethodsItemsListValue : cachedMethodsItemsList) {
                                        xmlWriter.startElement("Method");
                                        xmlWriter.value(cachedMethodsItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        if (defaultCacheBehavior.getSmoothStreaming() != null) {
                            xmlWriter.startElement("SmoothStreaming").value(defaultCacheBehavior.getSmoothStreaming()).endElement();
                        }

                        if (defaultCacheBehavior.getDefaultTTL() != null) {
                            xmlWriter.startElement("DefaultTTL").value(defaultCacheBehavior.getDefaultTTL()).endElement();
                        }

                        if (defaultCacheBehavior.getMaxTTL() != null) {
                            xmlWriter.startElement("MaxTTL").value(defaultCacheBehavior.getMaxTTL()).endElement();
                        }

                        if (defaultCacheBehavior.getCompress() != null) {
                            xmlWriter.startElement("Compress").value(defaultCacheBehavior.getCompress()).endElement();
                        }

                        LambdaFunctionAssociations lambdaFunctionAssociations = defaultCacheBehavior.getLambdaFunctionAssociations();
                        if (lambdaFunctionAssociations != null) {
                            xmlWriter.startElement("LambdaFunctionAssociations");

                            if (lambdaFunctionAssociations.getQuantity() != null) {
                                xmlWriter.startElement("Quantity").value(lambdaFunctionAssociations.getQuantity()).endElement();
                            }

                            com.amazonaws.internal.SdkInternalList<LambdaFunctionAssociation> lambdaFunctionAssociationsItemsList = (com.amazonaws.internal.SdkInternalList<LambdaFunctionAssociation>) lambdaFunctionAssociations
                                    .getItems();
                            if (!lambdaFunctionAssociationsItemsList.isEmpty() || !lambdaFunctionAssociationsItemsList.isAutoConstruct()) {
                                xmlWriter.startElement("Items");

                                for (LambdaFunctionAssociation lambdaFunctionAssociationsItemsListValue : lambdaFunctionAssociationsItemsList) {
                                    xmlWriter.startElement("LambdaFunctionAssociation");

                                    if (lambdaFunctionAssociationsItemsListValue.getLambdaFunctionARN() != null) {
                                        xmlWriter.startElement("LambdaFunctionARN").value(lambdaFunctionAssociationsItemsListValue.getLambdaFunctionARN())
                                                .endElement();
                                    }

                                    if (lambdaFunctionAssociationsItemsListValue.getEventType() != null) {
                                        xmlWriter.startElement("EventType").value(lambdaFunctionAssociationsItemsListValue.getEventType()).endElement();
                                    }

                                    if (lambdaFunctionAssociationsItemsListValue.getIncludeBody() != null) {
                                        xmlWriter.startElement("IncludeBody").value(lambdaFunctionAssociationsItemsListValue.getIncludeBody()).endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        if (defaultCacheBehavior.getFieldLevelEncryptionId() != null) {
                            xmlWriter.startElement("FieldLevelEncryptionId").value(defaultCacheBehavior.getFieldLevelEncryptionId()).endElement();
                        }
                        xmlWriter.endElement();
                    }

                    CacheBehaviors cacheBehaviors = distributionConfig.getCacheBehaviors();
                    if (cacheBehaviors != null) {
                        xmlWriter.startElement("CacheBehaviors");

                        if (cacheBehaviors.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(cacheBehaviors.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<CacheBehavior> cacheBehaviorsItemsList = (com.amazonaws.internal.SdkInternalList<CacheBehavior>) cacheBehaviors
                                .getItems();
                        if (!cacheBehaviorsItemsList.isEmpty() || !cacheBehaviorsItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (CacheBehavior cacheBehaviorsItemsListValue : cacheBehaviorsItemsList) {
                                xmlWriter.startElement("CacheBehavior");

                                if (cacheBehaviorsItemsListValue.getPathPattern() != null) {
                                    xmlWriter.startElement("PathPattern").value(cacheBehaviorsItemsListValue.getPathPattern()).endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getTargetOriginId() != null) {
                                    xmlWriter.startElement("TargetOriginId").value(cacheBehaviorsItemsListValue.getTargetOriginId()).endElement();
                                }

                                ForwardedValues forwardedValues = cacheBehaviorsItemsListValue.getForwardedValues();
                                if (forwardedValues != null) {
                                    xmlWriter.startElement("ForwardedValues");

                                    if (forwardedValues.getQueryString() != null) {
                                        xmlWriter.startElement("QueryString").value(forwardedValues.getQueryString()).endElement();
                                    }

                                    CookiePreference cookies = forwardedValues.getCookies();
                                    if (cookies != null) {
                                        xmlWriter.startElement("Cookies");

                                        if (cookies.getForward() != null) {
                                            xmlWriter.startElement("Forward").value(cookies.getForward()).endElement();
                                        }

                                        CookieNames whitelistedNames = cookies.getWhitelistedNames();
                                        if (whitelistedNames != null) {
                                            xmlWriter.startElement("WhitelistedNames");

                                            if (whitelistedNames.getQuantity() != null) {
                                                xmlWriter.startElement("Quantity").value(whitelistedNames.getQuantity()).endElement();
                                            }

                                            com.amazonaws.internal.SdkInternalList<String> cookieNamesItemsList = (com.amazonaws.internal.SdkInternalList<String>) whitelistedNames
                                                    .getItems();
                                            if (!cookieNamesItemsList.isEmpty() || !cookieNamesItemsList.isAutoConstruct()) {
                                                xmlWriter.startElement("Items");

                                                for (String cookieNamesItemsListValue : cookieNamesItemsList) {
                                                    xmlWriter.startElement("Name");
                                                    xmlWriter.value(cookieNamesItemsListValue);
                                                    xmlWriter.endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }

                                    Headers headers = forwardedValues.getHeaders();
                                    if (headers != null) {
                                        xmlWriter.startElement("Headers");

                                        if (headers.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(headers.getQuantity()).endElement();
                                        }

                                        com.amazonaws.internal.SdkInternalList<String> headersItemsList = (com.amazonaws.internal.SdkInternalList<String>) headers
                                                .getItems();
                                        if (!headersItemsList.isEmpty() || !headersItemsList.isAutoConstruct()) {
                                            xmlWriter.startElement("Items");

                                            for (String headersItemsListValue : headersItemsList) {
                                                xmlWriter.startElement("Name");
                                                xmlWriter.value(headersItemsListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }

                                    QueryStringCacheKeys queryStringCacheKeys = forwardedValues.getQueryStringCacheKeys();
                                    if (queryStringCacheKeys != null) {
                                        xmlWriter.startElement("QueryStringCacheKeys");

                                        if (queryStringCacheKeys.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(queryStringCacheKeys.getQuantity()).endElement();
                                        }

                                        com.amazonaws.internal.SdkInternalList<String> queryStringCacheKeysItemsList = (com.amazonaws.internal.SdkInternalList<String>) queryStringCacheKeys
                                                .getItems();
                                        if (!queryStringCacheKeysItemsList.isEmpty() || !queryStringCacheKeysItemsList.isAutoConstruct()) {
                                            xmlWriter.startElement("Items");

                                            for (String queryStringCacheKeysItemsListValue : queryStringCacheKeysItemsList) {
                                                xmlWriter.startElement("Name");
                                                xmlWriter.value(queryStringCacheKeysItemsListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                TrustedSigners trustedSigners = cacheBehaviorsItemsListValue.getTrustedSigners();
                                if (trustedSigners != null) {
                                    xmlWriter.startElement("TrustedSigners");

                                    if (trustedSigners.getEnabled() != null) {
                                        xmlWriter.startElement("Enabled").value(trustedSigners.getEnabled()).endElement();
                                    }

                                    if (trustedSigners.getQuantity() != null) {
                                        xmlWriter.startElement("Quantity").value(trustedSigners.getQuantity()).endElement();
                                    }

                                    com.amazonaws.internal.SdkInternalList<String> trustedSignersItemsList = (com.amazonaws.internal.SdkInternalList<String>) trustedSigners
                                            .getItems();
                                    if (!trustedSignersItemsList.isEmpty() || !trustedSignersItemsList.isAutoConstruct()) {
                                        xmlWriter.startElement("Items");

                                        for (String trustedSignersItemsListValue : trustedSignersItemsList) {
                                            xmlWriter.startElement("AwsAccountNumber");
                                            xmlWriter.value(trustedSignersItemsListValue);
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getViewerProtocolPolicy() != null) {
                                    xmlWriter.startElement("ViewerProtocolPolicy").value(cacheBehaviorsItemsListValue.getViewerProtocolPolicy()).endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getMinTTL() != null) {
                                    xmlWriter.startElement("MinTTL").value(cacheBehaviorsItemsListValue.getMinTTL()).endElement();
                                }

                                AllowedMethods allowedMethods = cacheBehaviorsItemsListValue.getAllowedMethods();
                                if (allowedMethods != null) {
                                    xmlWriter.startElement("AllowedMethods");

                                    if (allowedMethods.getQuantity() != null) {
                                        xmlWriter.startElement("Quantity").value(allowedMethods.getQuantity()).endElement();
                                    }

                                    com.amazonaws.internal.SdkInternalList<String> allowedMethodsItemsList = (com.amazonaws.internal.SdkInternalList<String>) allowedMethods
                                            .getItems();
                                    if (!allowedMethodsItemsList.isEmpty() || !allowedMethodsItemsList.isAutoConstruct()) {
                                        xmlWriter.startElement("Items");

                                        for (String allowedMethodsItemsListValue : allowedMethodsItemsList) {
                                            xmlWriter.startElement("Method");
                                            xmlWriter.value(allowedMethodsItemsListValue);
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }

                                    CachedMethods cachedMethods = allowedMethods.getCachedMethods();
                                    if (cachedMethods != null) {
                                        xmlWriter.startElement("CachedMethods");

                                        if (cachedMethods.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(cachedMethods.getQuantity()).endElement();
                                        }

                                        com.amazonaws.internal.SdkInternalList<String> cachedMethodsItemsList = (com.amazonaws.internal.SdkInternalList<String>) cachedMethods
                                                .getItems();
                                        if (!cachedMethodsItemsList.isEmpty() || !cachedMethodsItemsList.isAutoConstruct()) {
                                            xmlWriter.startElement("Items");

                                            for (String cachedMethodsItemsListValue : cachedMethodsItemsList) {
                                                xmlWriter.startElement("Method");
                                                xmlWriter.value(cachedMethodsItemsListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getSmoothStreaming() != null) {
                                    xmlWriter.startElement("SmoothStreaming").value(cacheBehaviorsItemsListValue.getSmoothStreaming()).endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getDefaultTTL() != null) {
                                    xmlWriter.startElement("DefaultTTL").value(cacheBehaviorsItemsListValue.getDefaultTTL()).endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getMaxTTL() != null) {
                                    xmlWriter.startElement("MaxTTL").value(cacheBehaviorsItemsListValue.getMaxTTL()).endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getCompress() != null) {
                                    xmlWriter.startElement("Compress").value(cacheBehaviorsItemsListValue.getCompress()).endElement();
                                }

                                LambdaFunctionAssociations lambdaFunctionAssociations = cacheBehaviorsItemsListValue.getLambdaFunctionAssociations();
                                if (lambdaFunctionAssociations != null) {
                                    xmlWriter.startElement("LambdaFunctionAssociations");

                                    if (lambdaFunctionAssociations.getQuantity() != null) {
                                        xmlWriter.startElement("Quantity").value(lambdaFunctionAssociations.getQuantity()).endElement();
                                    }

                                    com.amazonaws.internal.SdkInternalList<LambdaFunctionAssociation> lambdaFunctionAssociationsItemsList = (com.amazonaws.internal.SdkInternalList<LambdaFunctionAssociation>) lambdaFunctionAssociations
                                            .getItems();
                                    if (!lambdaFunctionAssociationsItemsList.isEmpty() || !lambdaFunctionAssociationsItemsList.isAutoConstruct()) {
                                        xmlWriter.startElement("Items");

                                        for (LambdaFunctionAssociation lambdaFunctionAssociationsItemsListValue : lambdaFunctionAssociationsItemsList) {
                                            xmlWriter.startElement("LambdaFunctionAssociation");

                                            if (lambdaFunctionAssociationsItemsListValue.getLambdaFunctionARN() != null) {
                                                xmlWriter.startElement("LambdaFunctionARN")
                                                        .value(lambdaFunctionAssociationsItemsListValue.getLambdaFunctionARN()).endElement();
                                            }

                                            if (lambdaFunctionAssociationsItemsListValue.getEventType() != null) {
                                                xmlWriter.startElement("EventType").value(lambdaFunctionAssociationsItemsListValue.getEventType()).endElement();
                                            }

                                            if (lambdaFunctionAssociationsItemsListValue.getIncludeBody() != null) {
                                                xmlWriter.startElement("IncludeBody").value(lambdaFunctionAssociationsItemsListValue.getIncludeBody())
                                                        .endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                if (cacheBehaviorsItemsListValue.getFieldLevelEncryptionId() != null) {
                                    xmlWriter.startElement("FieldLevelEncryptionId").value(cacheBehaviorsItemsListValue.getFieldLevelEncryptionId())
                                            .endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    CustomErrorResponses customErrorResponses = distributionConfig.getCustomErrorResponses();
                    if (customErrorResponses != null) {
                        xmlWriter.startElement("CustomErrorResponses");

                        if (customErrorResponses.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(customErrorResponses.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<CustomErrorResponse> customErrorResponsesItemsList = (com.amazonaws.internal.SdkInternalList<CustomErrorResponse>) customErrorResponses
                                .getItems();
                        if (!customErrorResponsesItemsList.isEmpty() || !customErrorResponsesItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (CustomErrorResponse customErrorResponsesItemsListValue : customErrorResponsesItemsList) {
                                xmlWriter.startElement("CustomErrorResponse");

                                if (customErrorResponsesItemsListValue.getErrorCode() != null) {
                                    xmlWriter.startElement("ErrorCode").value(customErrorResponsesItemsListValue.getErrorCode()).endElement();
                                }

                                if (customErrorResponsesItemsListValue.getResponsePagePath() != null) {
                                    xmlWriter.startElement("ResponsePagePath").value(customErrorResponsesItemsListValue.getResponsePagePath()).endElement();
                                }

                                if (customErrorResponsesItemsListValue.getResponseCode() != null) {
                                    xmlWriter.startElement("ResponseCode").value(customErrorResponsesItemsListValue.getResponseCode()).endElement();
                                }

                                if (customErrorResponsesItemsListValue.getErrorCachingMinTTL() != null) {
                                    xmlWriter.startElement("ErrorCachingMinTTL").value(customErrorResponsesItemsListValue.getErrorCachingMinTTL()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (distributionConfig.getComment() != null) {
                        xmlWriter.startElement("Comment").value(distributionConfig.getComment()).endElement();
                    }

                    LoggingConfig logging = distributionConfig.getLogging();
                    if (logging != null) {
                        xmlWriter.startElement("Logging");

                        if (logging.getEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(logging.getEnabled()).endElement();
                        }

                        if (logging.getIncludeCookies() != null) {
                            xmlWriter.startElement("IncludeCookies").value(logging.getIncludeCookies()).endElement();
                        }

                        if (logging.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(logging.getBucket()).endElement();
                        }

                        if (logging.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(logging.getPrefix()).endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (distributionConfig.getPriceClass() != null) {
                        xmlWriter.startElement("PriceClass").value(distributionConfig.getPriceClass()).endElement();
                    }

                    if (distributionConfig.getEnabled() != null) {
                        xmlWriter.startElement("Enabled").value(distributionConfig.getEnabled()).endElement();
                    }

                    ViewerCertificate viewerCertificate = distributionConfig.getViewerCertificate();
                    if (viewerCertificate != null) {
                        xmlWriter.startElement("ViewerCertificate");

                        if (viewerCertificate.getCloudFrontDefaultCertificate() != null) {
                            xmlWriter.startElement("CloudFrontDefaultCertificate").value(viewerCertificate.getCloudFrontDefaultCertificate()).endElement();
                        }

                        if (viewerCertificate.getIAMCertificateId() != null) {
                            xmlWriter.startElement("IAMCertificateId").value(viewerCertificate.getIAMCertificateId()).endElement();
                        }

                        if (viewerCertificate.getACMCertificateArn() != null) {
                            xmlWriter.startElement("ACMCertificateArn").value(viewerCertificate.getACMCertificateArn()).endElement();
                        }

                        if (viewerCertificate.getSSLSupportMethod() != null) {
                            xmlWriter.startElement("SSLSupportMethod").value(viewerCertificate.getSSLSupportMethod()).endElement();
                        }

                        if (viewerCertificate.getMinimumProtocolVersion() != null) {
                            xmlWriter.startElement("MinimumProtocolVersion").value(viewerCertificate.getMinimumProtocolVersion()).endElement();
                        }

                        if (viewerCertificate.getCertificate() != null) {
                            xmlWriter.startElement("Certificate").value(viewerCertificate.getCertificate()).endElement();
                        }

                        if (viewerCertificate.getCertificateSource() != null) {
                            xmlWriter.startElement("CertificateSource").value(viewerCertificate.getCertificateSource()).endElement();
                        }
                        xmlWriter.endElement();
                    }

                    Restrictions restrictions = distributionConfig.getRestrictions();
                    if (restrictions != null) {
                        xmlWriter.startElement("Restrictions");

                        GeoRestriction geoRestriction = restrictions.getGeoRestriction();
                        if (geoRestriction != null) {
                            xmlWriter.startElement("GeoRestriction");

                            if (geoRestriction.getRestrictionType() != null) {
                                xmlWriter.startElement("RestrictionType").value(geoRestriction.getRestrictionType()).endElement();
                            }

                            if (geoRestriction.getQuantity() != null) {
                                xmlWriter.startElement("Quantity").value(geoRestriction.getQuantity()).endElement();
                            }

                            com.amazonaws.internal.SdkInternalList<String> geoRestrictionItemsList = (com.amazonaws.internal.SdkInternalList<String>) geoRestriction
                                    .getItems();
                            if (!geoRestrictionItemsList.isEmpty() || !geoRestrictionItemsList.isAutoConstruct()) {
                                xmlWriter.startElement("Items");

                                for (String geoRestrictionItemsListValue : geoRestrictionItemsList) {
                                    xmlWriter.startElement("Location");
                                    xmlWriter.value(geoRestrictionItemsListValue);
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }

                    if (distributionConfig.getWebACLId() != null) {
                        xmlWriter.startElement("WebACLId").value(distributionConfig.getWebACLId()).endElement();
                    }

                    if (distributionConfig.getHttpVersion() != null) {
                        xmlWriter.startElement("HttpVersion").value(distributionConfig.getHttpVersion()).endElement();
                    }

                    if (distributionConfig.getIsIPV6Enabled() != null) {
                        xmlWriter.startElement("IsIPV6Enabled").value(distributionConfig.getIsIPV6Enabled()).endElement();
                    }
                    xmlWriter.endElement();
                }

                Tags tags = distributionConfigWithTags.getTags();
                if (tags != null) {
                    xmlWriter.startElement("Tags");

                    com.amazonaws.internal.SdkInternalList<Tag> tagsItemsList = (com.amazonaws.internal.SdkInternalList<Tag>) tags.getItems();
                    if (!tagsItemsList.isEmpty() || !tagsItemsList.isAutoConstruct()) {
                        xmlWriter.startElement("Items");

                        for (Tag tagsItemsListValue : tagsItemsList) {
                            xmlWriter.startElement("Tag");

                            if (tagsItemsListValue.getKey() != null) {
                                xmlWriter.startElement("Key").value(tagsItemsListValue.getKey()).endElement();
                            }

                            if (tagsItemsListValue.getValue() != null) {
                                xmlWriter.startElement("Value").value(tagsItemsListValue.getValue()).endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }
                xmlWriter.endElement();
            }

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
