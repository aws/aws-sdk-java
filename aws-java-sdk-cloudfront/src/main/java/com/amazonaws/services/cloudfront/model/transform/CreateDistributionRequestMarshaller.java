/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Create Distribution Request Marshaller
 */
public class CreateDistributionRequestMarshaller implements Marshaller<Request<CreateDistributionRequest>, CreateDistributionRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "2015-04-17/distribution";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<CreateDistributionRequest> marshall(CreateDistributionRequest createDistributionRequest) {

        if (createDistributionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDistributionRequest> request = new DefaultRequest<CreateDistributionRequest>(createDistributionRequest, "AmazonCloudFront");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2015-04-17/");

                    if (createDistributionRequest != null) {
            DistributionConfig distributionConfigDistributionConfig = createDistributionRequest.getDistributionConfig();
            if (distributionConfigDistributionConfig != null) {
                xmlWriter.startElement("DistributionConfig");
                if (distributionConfigDistributionConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(distributionConfigDistributionConfig.getCallerReference()).endElement();
                }
                if (distributionConfigDistributionConfig != null) {
                    Aliases aliasesAliases = distributionConfigDistributionConfig.getAliases();
                    if (aliasesAliases != null) {
                        xmlWriter.startElement("Aliases");
                        if (aliasesAliases.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(aliasesAliases.getQuantity()).endElement();
                        }

                        if (aliasesAliases != null) {
                            java.util.List<String> aliasesAliasesitemsList = aliasesAliases.getItems();
                            if (aliasesAliasesitemsList != null && aliasesAliasesitemsList.size() > 0) {
                                int aliasesAliasesitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (String aliasesAliasesitemsListValue : aliasesAliasesitemsList) {

                                xmlWriter.startElement("CNAME");
                                    xmlWriter.value(aliasesAliasesitemsListValue);
                                xmlWriter.endElement();

                                    aliasesAliasesitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig.getDefaultRootObject() != null) {
                    xmlWriter.startElement("DefaultRootObject").value(distributionConfigDistributionConfig.getDefaultRootObject()).endElement();
                }
                if (distributionConfigDistributionConfig != null) {
                    Origins originsOrigins = distributionConfigDistributionConfig.getOrigins();
                    if (originsOrigins != null) {
                        xmlWriter.startElement("Origins");
                        if (originsOrigins.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(originsOrigins.getQuantity()).endElement();
                        }

                        if (originsOrigins != null) {
                            java.util.List<Origin> originsOriginsitemsList = originsOrigins.getItems();
                            if (originsOriginsitemsList != null && originsOriginsitemsList.size() > 0) {
                                int originsOriginsitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (Origin originsOriginsitemsListValue : originsOriginsitemsList) {

                                xmlWriter.startElement("Origin");
                                    if (originsOriginsitemsListValue.getId() != null) {
                                        xmlWriter.startElement("Id").value(originsOriginsitemsListValue.getId()).endElement();
                                    }
                                    if (originsOriginsitemsListValue.getDomainName() != null) {
                                        xmlWriter.startElement("DomainName").value(originsOriginsitemsListValue.getDomainName()).endElement();
                                    }
                                    if (originsOriginsitemsListValue.getOriginPath() != null) {
                                        xmlWriter.startElement("OriginPath").value(originsOriginsitemsListValue.getOriginPath()).endElement();
                                    }
                                    if (originsOriginsitemsListValue != null) {
                                        S3OriginConfig s3OriginConfigS3OriginConfig = originsOriginsitemsListValue.getS3OriginConfig();
                                        if (s3OriginConfigS3OriginConfig != null) {
                                            xmlWriter.startElement("S3OriginConfig");
                                            if (s3OriginConfigS3OriginConfig.getOriginAccessIdentity() != null) {
                                                xmlWriter.startElement("OriginAccessIdentity").value(s3OriginConfigS3OriginConfig.getOriginAccessIdentity()).endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                    if (originsOriginsitemsListValue != null) {
                                        CustomOriginConfig customOriginConfigCustomOriginConfig = originsOriginsitemsListValue.getCustomOriginConfig();
                                        if (customOriginConfigCustomOriginConfig != null) {
                                            xmlWriter.startElement("CustomOriginConfig");
                                            if (customOriginConfigCustomOriginConfig.getHTTPPort() != null) {
                                                xmlWriter.startElement("HTTPPort").value(customOriginConfigCustomOriginConfig.getHTTPPort()).endElement();
                                            }
                                            if (customOriginConfigCustomOriginConfig.getHTTPSPort() != null) {
                                                xmlWriter.startElement("HTTPSPort").value(customOriginConfigCustomOriginConfig.getHTTPSPort()).endElement();
                                            }
                                            if (customOriginConfigCustomOriginConfig.getOriginProtocolPolicy() != null) {
                                                xmlWriter.startElement("OriginProtocolPolicy").value(customOriginConfigCustomOriginConfig.getOriginProtocolPolicy()).endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                xmlWriter.endElement();

                                    originsOriginsitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    DefaultCacheBehavior defaultCacheBehaviorDefaultCacheBehavior = distributionConfigDistributionConfig.getDefaultCacheBehavior();
                    if (defaultCacheBehaviorDefaultCacheBehavior != null) {
                        xmlWriter.startElement("DefaultCacheBehavior");
                        if (defaultCacheBehaviorDefaultCacheBehavior.getTargetOriginId() != null) {
                            xmlWriter.startElement("TargetOriginId").value(defaultCacheBehaviorDefaultCacheBehavior.getTargetOriginId()).endElement();
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior != null) {
                            ForwardedValues forwardedValuesForwardedValues = defaultCacheBehaviorDefaultCacheBehavior.getForwardedValues();
                            if (forwardedValuesForwardedValues != null) {
                                xmlWriter.startElement("ForwardedValues");
                                if (forwardedValuesForwardedValues.isQueryString() != null) {
                                    xmlWriter.startElement("QueryString").value(forwardedValuesForwardedValues.isQueryString()).endElement();
                                }
                                if (forwardedValuesForwardedValues != null) {
                                    CookiePreference cookiePreferenceCookies = forwardedValuesForwardedValues.getCookies();
                                    if (cookiePreferenceCookies != null) {
                                        xmlWriter.startElement("Cookies");
                                        if (cookiePreferenceCookies.getForward() != null) {
                                            xmlWriter.startElement("Forward").value(cookiePreferenceCookies.getForward()).endElement();
                                        }
                                        if (cookiePreferenceCookies != null) {
                                            CookieNames cookieNamesWhitelistedNames = cookiePreferenceCookies.getWhitelistedNames();
                                            if (cookieNamesWhitelistedNames != null) {
                                                xmlWriter.startElement("WhitelistedNames");
                                                if (cookieNamesWhitelistedNames.getQuantity() != null) {
                                                    xmlWriter.startElement("Quantity").value(cookieNamesWhitelistedNames.getQuantity()).endElement();
                                                }

                                                if (cookieNamesWhitelistedNames != null) {
                                                    java.util.List<String> cookieNamesWhitelistedNamesitemsList = cookieNamesWhitelistedNames.getItems();
                                                    if (cookieNamesWhitelistedNamesitemsList != null && cookieNamesWhitelistedNamesitemsList.size() > 0) {
                                                        int cookieNamesWhitelistedNamesitemsListIndex = 1;
                                                        xmlWriter.startElement("Items");
                                                        for (String cookieNamesWhitelistedNamesitemsListValue : cookieNamesWhitelistedNamesitemsList) {

                                                        xmlWriter.startElement("Name");
                                                            xmlWriter.value(cookieNamesWhitelistedNamesitemsListValue);
                                                        xmlWriter.endElement();

                                                            cookieNamesWhitelistedNamesitemsListIndex++;
                                                        }
                                                        xmlWriter.endElement();
                                                    }
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                if (forwardedValuesForwardedValues != null) {
                                    Headers headersHeaders = forwardedValuesForwardedValues.getHeaders();
                                    if (headersHeaders != null) {
                                        xmlWriter.startElement("Headers");
                                        if (headersHeaders.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(headersHeaders.getQuantity()).endElement();
                                        }

                                        if (headersHeaders != null) {
                                            java.util.List<String> headersHeadersitemsList = headersHeaders.getItems();
                                            if (headersHeadersitemsList != null && headersHeadersitemsList.size() > 0) {
                                                int headersHeadersitemsListIndex = 1;
                                                xmlWriter.startElement("Items");
                                                for (String headersHeadersitemsListValue : headersHeadersitemsList) {

                                                xmlWriter.startElement("Name");
                                                    xmlWriter.value(headersHeadersitemsListValue);
                                                xmlWriter.endElement();

                                                    headersHeadersitemsListIndex++;
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior != null) {
                            TrustedSigners trustedSignersTrustedSigners = defaultCacheBehaviorDefaultCacheBehavior.getTrustedSigners();
                            if (trustedSignersTrustedSigners != null) {
                                xmlWriter.startElement("TrustedSigners");
                                if (trustedSignersTrustedSigners.isEnabled() != null) {
                                    xmlWriter.startElement("Enabled").value(trustedSignersTrustedSigners.isEnabled()).endElement();
                                }
                                if (trustedSignersTrustedSigners.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(trustedSignersTrustedSigners.getQuantity()).endElement();
                                }

                                if (trustedSignersTrustedSigners != null) {
                                    java.util.List<String> trustedSignersTrustedSignersitemsList = trustedSignersTrustedSigners.getItems();
                                    if (trustedSignersTrustedSignersitemsList != null && trustedSignersTrustedSignersitemsList.size() > 0) {
                                        int trustedSignersTrustedSignersitemsListIndex = 1;
                                        xmlWriter.startElement("Items");
                                        for (String trustedSignersTrustedSignersitemsListValue : trustedSignersTrustedSignersitemsList) {

                                        xmlWriter.startElement("AwsAccountNumber");
                                            xmlWriter.value(trustedSignersTrustedSignersitemsListValue);
                                        xmlWriter.endElement();

                                            trustedSignersTrustedSignersitemsListIndex++;
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior.getViewerProtocolPolicy() != null) {
                            xmlWriter.startElement("ViewerProtocolPolicy").value(defaultCacheBehaviorDefaultCacheBehavior.getViewerProtocolPolicy()).endElement();
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior.getMinTTL() != null) {
                            xmlWriter.startElement("MinTTL").value(defaultCacheBehaviorDefaultCacheBehavior.getMinTTL()).endElement();
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior != null) {
                            AllowedMethods allowedMethodsAllowedMethods = defaultCacheBehaviorDefaultCacheBehavior.getAllowedMethods();
                            if (allowedMethodsAllowedMethods != null) {
                                xmlWriter.startElement("AllowedMethods");
                                if (allowedMethodsAllowedMethods.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(allowedMethodsAllowedMethods.getQuantity()).endElement();
                                }

                                if (allowedMethodsAllowedMethods != null) {
                                    java.util.List<String> allowedMethodsAllowedMethodsitemsList = allowedMethodsAllowedMethods.getItems();
                                    if (allowedMethodsAllowedMethodsitemsList != null && allowedMethodsAllowedMethodsitemsList.size() > 0) {
                                        int allowedMethodsAllowedMethodsitemsListIndex = 1;
                                        xmlWriter.startElement("Items");
                                        for (String allowedMethodsAllowedMethodsitemsListValue : allowedMethodsAllowedMethodsitemsList) {

                                        xmlWriter.startElement("Method");
                                            xmlWriter.value(allowedMethodsAllowedMethodsitemsListValue);
                                        xmlWriter.endElement();

                                            allowedMethodsAllowedMethodsitemsListIndex++;
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                if (allowedMethodsAllowedMethods != null) {
                                    CachedMethods cachedMethodsCachedMethods = allowedMethodsAllowedMethods.getCachedMethods();
                                    if (cachedMethodsCachedMethods != null) {
                                        xmlWriter.startElement("CachedMethods");
                                        if (cachedMethodsCachedMethods.getQuantity() != null) {
                                            xmlWriter.startElement("Quantity").value(cachedMethodsCachedMethods.getQuantity()).endElement();
                                        }

                                        if (cachedMethodsCachedMethods != null) {
                                            java.util.List<String> cachedMethodsCachedMethodsitemsList = cachedMethodsCachedMethods.getItems();
                                            if (cachedMethodsCachedMethodsitemsList != null && cachedMethodsCachedMethodsitemsList.size() > 0) {
                                                int cachedMethodsCachedMethodsitemsListIndex = 1;
                                                xmlWriter.startElement("Items");
                                                for (String cachedMethodsCachedMethodsitemsListValue : cachedMethodsCachedMethodsitemsList) {

                                                xmlWriter.startElement("Method");
                                                    xmlWriter.value(cachedMethodsCachedMethodsitemsListValue);
                                                xmlWriter.endElement();

                                                    cachedMethodsCachedMethodsitemsListIndex++;
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior.isSmoothStreaming() != null) {
                            xmlWriter.startElement("SmoothStreaming").value(defaultCacheBehaviorDefaultCacheBehavior.isSmoothStreaming()).endElement();
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior.getDefaultTTL() != null) {
                            xmlWriter.startElement("DefaultTTL").value(defaultCacheBehaviorDefaultCacheBehavior.getDefaultTTL()).endElement();
                        }
                        if (defaultCacheBehaviorDefaultCacheBehavior.getMaxTTL() != null) {
                            xmlWriter.startElement("MaxTTL").value(defaultCacheBehaviorDefaultCacheBehavior.getMaxTTL()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    CacheBehaviors cacheBehaviorsCacheBehaviors = distributionConfigDistributionConfig.getCacheBehaviors();
                    if (cacheBehaviorsCacheBehaviors != null) {
                        xmlWriter.startElement("CacheBehaviors");
                        if (cacheBehaviorsCacheBehaviors.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(cacheBehaviorsCacheBehaviors.getQuantity()).endElement();
                        }

                        if (cacheBehaviorsCacheBehaviors != null) {
                            java.util.List<CacheBehavior> cacheBehaviorsCacheBehaviorsitemsList = cacheBehaviorsCacheBehaviors.getItems();
                            if (cacheBehaviorsCacheBehaviorsitemsList != null && cacheBehaviorsCacheBehaviorsitemsList.size() > 0) {
                                int cacheBehaviorsCacheBehaviorsitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (CacheBehavior cacheBehaviorsCacheBehaviorsitemsListValue : cacheBehaviorsCacheBehaviorsitemsList) {

                                xmlWriter.startElement("CacheBehavior");
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.getPathPattern() != null) {
                                        xmlWriter.startElement("PathPattern").value(cacheBehaviorsCacheBehaviorsitemsListValue.getPathPattern()).endElement();
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.getTargetOriginId() != null) {
                                        xmlWriter.startElement("TargetOriginId").value(cacheBehaviorsCacheBehaviorsitemsListValue.getTargetOriginId()).endElement();
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue != null) {
                                        ForwardedValues forwardedValuesForwardedValues = cacheBehaviorsCacheBehaviorsitemsListValue.getForwardedValues();
                                        if (forwardedValuesForwardedValues != null) {
                                            xmlWriter.startElement("ForwardedValues");
                                            if (forwardedValuesForwardedValues.isQueryString() != null) {
                                                xmlWriter.startElement("QueryString").value(forwardedValuesForwardedValues.isQueryString()).endElement();
                                            }
                                            if (forwardedValuesForwardedValues != null) {
                                                CookiePreference cookiePreferenceCookies = forwardedValuesForwardedValues.getCookies();
                                                if (cookiePreferenceCookies != null) {
                                                    xmlWriter.startElement("Cookies");
                                                    if (cookiePreferenceCookies.getForward() != null) {
                                                        xmlWriter.startElement("Forward").value(cookiePreferenceCookies.getForward()).endElement();
                                                    }
                                                    if (cookiePreferenceCookies != null) {
                                                        CookieNames cookieNamesWhitelistedNames = cookiePreferenceCookies.getWhitelistedNames();
                                                        if (cookieNamesWhitelistedNames != null) {
                                                            xmlWriter.startElement("WhitelistedNames");
                                                            if (cookieNamesWhitelistedNames.getQuantity() != null) {
                                                                xmlWriter.startElement("Quantity").value(cookieNamesWhitelistedNames.getQuantity()).endElement();
                                                            }

                                                            if (cookieNamesWhitelistedNames != null) {
                                                                java.util.List<String> cookieNamesWhitelistedNamesitemsList = cookieNamesWhitelistedNames.getItems();
                                                                if (cookieNamesWhitelistedNamesitemsList != null && cookieNamesWhitelistedNamesitemsList.size() > 0) {
                                                                    int cookieNamesWhitelistedNamesitemsListIndex = 1;
                                                                    xmlWriter.startElement("Items");
                                                                    for (String cookieNamesWhitelistedNamesitemsListValue : cookieNamesWhitelistedNamesitemsList) {

                                                                    xmlWriter.startElement("Name");
                                                                        xmlWriter.value(cookieNamesWhitelistedNamesitemsListValue);
                                                                    xmlWriter.endElement();

                                                                        cookieNamesWhitelistedNamesitemsListIndex++;
                                                                    }
                                                                    xmlWriter.endElement();
                                                                }
                                                            }
                                                            xmlWriter.endElement();
                                                        }
                                                    }
                                                    xmlWriter.endElement();
                                                }
                                            }
                                            if (forwardedValuesForwardedValues != null) {
                                                Headers headersHeaders = forwardedValuesForwardedValues.getHeaders();
                                                if (headersHeaders != null) {
                                                    xmlWriter.startElement("Headers");
                                                    if (headersHeaders.getQuantity() != null) {
                                                        xmlWriter.startElement("Quantity").value(headersHeaders.getQuantity()).endElement();
                                                    }

                                                    if (headersHeaders != null) {
                                                        java.util.List<String> headersHeadersitemsList = headersHeaders.getItems();
                                                        if (headersHeadersitemsList != null && headersHeadersitemsList.size() > 0) {
                                                            int headersHeadersitemsListIndex = 1;
                                                            xmlWriter.startElement("Items");
                                                            for (String headersHeadersitemsListValue : headersHeadersitemsList) {

                                                            xmlWriter.startElement("Name");
                                                                xmlWriter.value(headersHeadersitemsListValue);
                                                            xmlWriter.endElement();

                                                                headersHeadersitemsListIndex++;
                                                            }
                                                            xmlWriter.endElement();
                                                        }
                                                    }
                                                    xmlWriter.endElement();
                                                }
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue != null) {
                                        TrustedSigners trustedSignersTrustedSigners = cacheBehaviorsCacheBehaviorsitemsListValue.getTrustedSigners();
                                        if (trustedSignersTrustedSigners != null) {
                                            xmlWriter.startElement("TrustedSigners");
                                            if (trustedSignersTrustedSigners.isEnabled() != null) {
                                                xmlWriter.startElement("Enabled").value(trustedSignersTrustedSigners.isEnabled()).endElement();
                                            }
                                            if (trustedSignersTrustedSigners.getQuantity() != null) {
                                                xmlWriter.startElement("Quantity").value(trustedSignersTrustedSigners.getQuantity()).endElement();
                                            }

                                            if (trustedSignersTrustedSigners != null) {
                                                java.util.List<String> trustedSignersTrustedSignersitemsList = trustedSignersTrustedSigners.getItems();
                                                if (trustedSignersTrustedSignersitemsList != null && trustedSignersTrustedSignersitemsList.size() > 0) {
                                                    int trustedSignersTrustedSignersitemsListIndex = 1;
                                                    xmlWriter.startElement("Items");
                                                    for (String trustedSignersTrustedSignersitemsListValue : trustedSignersTrustedSignersitemsList) {

                                                    xmlWriter.startElement("AwsAccountNumber");
                                                        xmlWriter.value(trustedSignersTrustedSignersitemsListValue);
                                                    xmlWriter.endElement();

                                                        trustedSignersTrustedSignersitemsListIndex++;
                                                    }
                                                    xmlWriter.endElement();
                                                }
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.getViewerProtocolPolicy() != null) {
                                        xmlWriter.startElement("ViewerProtocolPolicy").value(cacheBehaviorsCacheBehaviorsitemsListValue.getViewerProtocolPolicy()).endElement();
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.getMinTTL() != null) {
                                        xmlWriter.startElement("MinTTL").value(cacheBehaviorsCacheBehaviorsitemsListValue.getMinTTL()).endElement();
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue != null) {
                                        AllowedMethods allowedMethodsAllowedMethods = cacheBehaviorsCacheBehaviorsitemsListValue.getAllowedMethods();
                                        if (allowedMethodsAllowedMethods != null) {
                                            xmlWriter.startElement("AllowedMethods");
                                            if (allowedMethodsAllowedMethods.getQuantity() != null) {
                                                xmlWriter.startElement("Quantity").value(allowedMethodsAllowedMethods.getQuantity()).endElement();
                                            }

                                            if (allowedMethodsAllowedMethods != null) {
                                                java.util.List<String> allowedMethodsAllowedMethodsitemsList = allowedMethodsAllowedMethods.getItems();
                                                if (allowedMethodsAllowedMethodsitemsList != null && allowedMethodsAllowedMethodsitemsList.size() > 0) {
                                                    int allowedMethodsAllowedMethodsitemsListIndex = 1;
                                                    xmlWriter.startElement("Items");
                                                    for (String allowedMethodsAllowedMethodsitemsListValue : allowedMethodsAllowedMethodsitemsList) {

                                                    xmlWriter.startElement("Method");
                                                        xmlWriter.value(allowedMethodsAllowedMethodsitemsListValue);
                                                    xmlWriter.endElement();

                                                        allowedMethodsAllowedMethodsitemsListIndex++;
                                                    }
                                                    xmlWriter.endElement();
                                                }
                                            }
                                            if (allowedMethodsAllowedMethods != null) {
                                                CachedMethods cachedMethodsCachedMethods = allowedMethodsAllowedMethods.getCachedMethods();
                                                if (cachedMethodsCachedMethods != null) {
                                                    xmlWriter.startElement("CachedMethods");
                                                    if (cachedMethodsCachedMethods.getQuantity() != null) {
                                                        xmlWriter.startElement("Quantity").value(cachedMethodsCachedMethods.getQuantity()).endElement();
                                                    }

                                                    if (cachedMethodsCachedMethods != null) {
                                                        java.util.List<String> cachedMethodsCachedMethodsitemsList = cachedMethodsCachedMethods.getItems();
                                                        if (cachedMethodsCachedMethodsitemsList != null && cachedMethodsCachedMethodsitemsList.size() > 0) {
                                                            int cachedMethodsCachedMethodsitemsListIndex = 1;
                                                            xmlWriter.startElement("Items");
                                                            for (String cachedMethodsCachedMethodsitemsListValue : cachedMethodsCachedMethodsitemsList) {

                                                            xmlWriter.startElement("Method");
                                                                xmlWriter.value(cachedMethodsCachedMethodsitemsListValue);
                                                            xmlWriter.endElement();

                                                                cachedMethodsCachedMethodsitemsListIndex++;
                                                            }
                                                            xmlWriter.endElement();
                                                        }
                                                    }
                                                    xmlWriter.endElement();
                                                }
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.isSmoothStreaming() != null) {
                                        xmlWriter.startElement("SmoothStreaming").value(cacheBehaviorsCacheBehaviorsitemsListValue.isSmoothStreaming()).endElement();
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.getDefaultTTL() != null) {
                                        xmlWriter.startElement("DefaultTTL").value(cacheBehaviorsCacheBehaviorsitemsListValue.getDefaultTTL()).endElement();
                                    }
                                    if (cacheBehaviorsCacheBehaviorsitemsListValue.getMaxTTL() != null) {
                                        xmlWriter.startElement("MaxTTL").value(cacheBehaviorsCacheBehaviorsitemsListValue.getMaxTTL()).endElement();
                                    }
                                xmlWriter.endElement();

                                    cacheBehaviorsCacheBehaviorsitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    CustomErrorResponses customErrorResponsesCustomErrorResponses = distributionConfigDistributionConfig.getCustomErrorResponses();
                    if (customErrorResponsesCustomErrorResponses != null) {
                        xmlWriter.startElement("CustomErrorResponses");
                        if (customErrorResponsesCustomErrorResponses.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(customErrorResponsesCustomErrorResponses.getQuantity()).endElement();
                        }

                        if (customErrorResponsesCustomErrorResponses != null) {
                            java.util.List<CustomErrorResponse> customErrorResponsesCustomErrorResponsesitemsList = customErrorResponsesCustomErrorResponses.getItems();
                            if (customErrorResponsesCustomErrorResponsesitemsList != null && customErrorResponsesCustomErrorResponsesitemsList.size() > 0) {
                                int customErrorResponsesCustomErrorResponsesitemsListIndex = 1;
                                xmlWriter.startElement("Items");
                                for (CustomErrorResponse customErrorResponsesCustomErrorResponsesitemsListValue : customErrorResponsesCustomErrorResponsesitemsList) {

                                xmlWriter.startElement("CustomErrorResponse");
                                    if (customErrorResponsesCustomErrorResponsesitemsListValue.getErrorCode() != null) {
                                        xmlWriter.startElement("ErrorCode").value(customErrorResponsesCustomErrorResponsesitemsListValue.getErrorCode()).endElement();
                                    }
                                    if (customErrorResponsesCustomErrorResponsesitemsListValue.getResponsePagePath() != null) {
                                        xmlWriter.startElement("ResponsePagePath").value(customErrorResponsesCustomErrorResponsesitemsListValue.getResponsePagePath()).endElement();
                                    }
                                    if (customErrorResponsesCustomErrorResponsesitemsListValue.getResponseCode() != null) {
                                        xmlWriter.startElement("ResponseCode").value(customErrorResponsesCustomErrorResponsesitemsListValue.getResponseCode()).endElement();
                                    }
                                    if (customErrorResponsesCustomErrorResponsesitemsListValue.getErrorCachingMinTTL() != null) {
                                        xmlWriter.startElement("ErrorCachingMinTTL").value(customErrorResponsesCustomErrorResponsesitemsListValue.getErrorCachingMinTTL()).endElement();
                                    }
                                xmlWriter.endElement();

                                    customErrorResponsesCustomErrorResponsesitemsListIndex++;
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(distributionConfigDistributionConfig.getComment()).endElement();
                }
                if (distributionConfigDistributionConfig != null) {
                    LoggingConfig loggingConfigLogging = distributionConfigDistributionConfig.getLogging();
                    if (loggingConfigLogging != null) {
                        xmlWriter.startElement("Logging");
                        if (loggingConfigLogging.isEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(loggingConfigLogging.isEnabled()).endElement();
                        }
                        if (loggingConfigLogging.isIncludeCookies() != null) {
                            xmlWriter.startElement("IncludeCookies").value(loggingConfigLogging.isIncludeCookies()).endElement();
                        }
                        if (loggingConfigLogging.getBucket() != null) {
                            xmlWriter.startElement("Bucket").value(loggingConfigLogging.getBucket()).endElement();
                        }
                        if (loggingConfigLogging.getPrefix() != null) {
                            xmlWriter.startElement("Prefix").value(loggingConfigLogging.getPrefix()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig.getPriceClass() != null) {
                    xmlWriter.startElement("PriceClass").value(distributionConfigDistributionConfig.getPriceClass()).endElement();
                }
                if (distributionConfigDistributionConfig.isEnabled() != null) {
                    xmlWriter.startElement("Enabled").value(distributionConfigDistributionConfig.isEnabled()).endElement();
                }
                if (distributionConfigDistributionConfig != null) {
                    ViewerCertificate viewerCertificateViewerCertificate = distributionConfigDistributionConfig.getViewerCertificate();
                    if (viewerCertificateViewerCertificate != null) {
                        xmlWriter.startElement("ViewerCertificate");
                        if (viewerCertificateViewerCertificate.getIAMCertificateId() != null) {
                            xmlWriter.startElement("IAMCertificateId").value(viewerCertificateViewerCertificate.getIAMCertificateId()).endElement();
                        }
                        if (viewerCertificateViewerCertificate.isCloudFrontDefaultCertificate() != null) {
                            xmlWriter.startElement("CloudFrontDefaultCertificate").value(viewerCertificateViewerCertificate.isCloudFrontDefaultCertificate()).endElement();
                        }
                        if (viewerCertificateViewerCertificate.getSSLSupportMethod() != null) {
                            xmlWriter.startElement("SSLSupportMethod").value(viewerCertificateViewerCertificate.getSSLSupportMethod()).endElement();
                        }
                        if (viewerCertificateViewerCertificate.getMinimumProtocolVersion() != null) {
                            xmlWriter.startElement("MinimumProtocolVersion").value(viewerCertificateViewerCertificate.getMinimumProtocolVersion()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                if (distributionConfigDistributionConfig != null) {
                    Restrictions restrictionsRestrictions = distributionConfigDistributionConfig.getRestrictions();
                    if (restrictionsRestrictions != null) {
                        xmlWriter.startElement("Restrictions");
                        if (restrictionsRestrictions != null) {
                            GeoRestriction geoRestrictionGeoRestriction = restrictionsRestrictions.getGeoRestriction();
                            if (geoRestrictionGeoRestriction != null) {
                                xmlWriter.startElement("GeoRestriction");
                                if (geoRestrictionGeoRestriction.getRestrictionType() != null) {
                                    xmlWriter.startElement("RestrictionType").value(geoRestrictionGeoRestriction.getRestrictionType()).endElement();
                                }
                                if (geoRestrictionGeoRestriction.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(geoRestrictionGeoRestriction.getQuantity()).endElement();
                                }

                                if (geoRestrictionGeoRestriction != null) {
                                    java.util.List<String> geoRestrictionGeoRestrictionitemsList = geoRestrictionGeoRestriction.getItems();
                                    if (geoRestrictionGeoRestrictionitemsList != null && geoRestrictionGeoRestrictionitemsList.size() > 0) {
                                        int geoRestrictionGeoRestrictionitemsListIndex = 1;
                                        xmlWriter.startElement("Items");
                                        for (String geoRestrictionGeoRestrictionitemsListValue : geoRestrictionGeoRestrictionitemsList) {

                                        xmlWriter.startElement("Location");
                                            xmlWriter.value(geoRestrictionGeoRestrictionitemsListValue);
                                        xmlWriter.endElement();

                                            geoRestrictionGeoRestrictionitemsListIndex++;
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }
                xmlWriter.endElement();
            }
        }

            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }

        return request;
    }
}
