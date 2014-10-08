/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Register Domain Request Marshaller
 */
public class RegisterDomainRequestMarshaller implements Marshaller<Request<RegisterDomainRequest>, RegisterDomainRequest> {

    public Request<RegisterDomainRequest> marshall(RegisterDomainRequest registerDomainRequest) {
        if (registerDomainRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterDomainRequest> request = new DefaultRequest<RegisterDomainRequest>(registerDomainRequest, "AmazonRoute53Domains");
        String target = "Route53Domains_v20140515.RegisterDomain";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (registerDomainRequest.getDomainName() != null) {
                jsonWriter.key("DomainName").value(registerDomainRequest.getDomainName());
            }
            if (registerDomainRequest.getIdnLangCode() != null) {
                jsonWriter.key("IdnLangCode").value(registerDomainRequest.getIdnLangCode());
            }
            if (registerDomainRequest.getDurationInYears() != null) {
                jsonWriter.key("DurationInYears").value(registerDomainRequest.getDurationInYears());
            }
            if (registerDomainRequest.isAutoRenew() != null) {
                jsonWriter.key("AutoRenew").value(registerDomainRequest.isAutoRenew());
            }
            ContactDetail adminContact = registerDomainRequest.getAdminContact();
            if (adminContact != null) {

                jsonWriter.key("AdminContact");
                jsonWriter.object();

                if (adminContact.getFirstName() != null) {
                    jsonWriter.key("FirstName").value(adminContact.getFirstName());
                }
                if (adminContact.getLastName() != null) {
                    jsonWriter.key("LastName").value(adminContact.getLastName());
                }
                if (adminContact.getContactType() != null) {
                    jsonWriter.key("ContactType").value(adminContact.getContactType());
                }
                if (adminContact.getOrganizationName() != null) {
                    jsonWriter.key("OrganizationName").value(adminContact.getOrganizationName());
                }
                if (adminContact.getAddressLine1() != null) {
                    jsonWriter.key("AddressLine1").value(adminContact.getAddressLine1());
                }
                if (adminContact.getAddressLine2() != null) {
                    jsonWriter.key("AddressLine2").value(adminContact.getAddressLine2());
                }
                if (adminContact.getCity() != null) {
                    jsonWriter.key("City").value(adminContact.getCity());
                }
                if (adminContact.getState() != null) {
                    jsonWriter.key("State").value(adminContact.getState());
                }
                if (adminContact.getCountryCode() != null) {
                    jsonWriter.key("CountryCode").value(adminContact.getCountryCode());
                }
                if (adminContact.getZipCode() != null) {
                    jsonWriter.key("ZipCode").value(adminContact.getZipCode());
                }
                if (adminContact.getPhoneNumber() != null) {
                    jsonWriter.key("PhoneNumber").value(adminContact.getPhoneNumber());
                }
                if (adminContact.getEmail() != null) {
                    jsonWriter.key("Email").value(adminContact.getEmail());
                }
                if (adminContact.getFax() != null) {
                    jsonWriter.key("Fax").value(adminContact.getFax());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam> extraParamsList = (com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam>)(adminContact.getExtraParams());
                if (extraParamsList != null && !(extraParamsList.isAutoConstruct() && extraParamsList.isEmpty())) {

                    jsonWriter.key("ExtraParams");
                    jsonWriter.array();

                    for (ExtraParam extraParamsListValue : extraParamsList) {
                        if (extraParamsListValue != null) {
                            jsonWriter.object();
                            if (extraParamsListValue.getName() != null) {
                                jsonWriter.key("Name").value(extraParamsListValue.getName());
                            }
                            if (extraParamsListValue.getValue() != null) {
                                jsonWriter.key("Value").value(extraParamsListValue.getValue());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            ContactDetail registrantContact = registerDomainRequest.getRegistrantContact();
            if (registrantContact != null) {

                jsonWriter.key("RegistrantContact");
                jsonWriter.object();

                if (registrantContact.getFirstName() != null) {
                    jsonWriter.key("FirstName").value(registrantContact.getFirstName());
                }
                if (registrantContact.getLastName() != null) {
                    jsonWriter.key("LastName").value(registrantContact.getLastName());
                }
                if (registrantContact.getContactType() != null) {
                    jsonWriter.key("ContactType").value(registrantContact.getContactType());
                }
                if (registrantContact.getOrganizationName() != null) {
                    jsonWriter.key("OrganizationName").value(registrantContact.getOrganizationName());
                }
                if (registrantContact.getAddressLine1() != null) {
                    jsonWriter.key("AddressLine1").value(registrantContact.getAddressLine1());
                }
                if (registrantContact.getAddressLine2() != null) {
                    jsonWriter.key("AddressLine2").value(registrantContact.getAddressLine2());
                }
                if (registrantContact.getCity() != null) {
                    jsonWriter.key("City").value(registrantContact.getCity());
                }
                if (registrantContact.getState() != null) {
                    jsonWriter.key("State").value(registrantContact.getState());
                }
                if (registrantContact.getCountryCode() != null) {
                    jsonWriter.key("CountryCode").value(registrantContact.getCountryCode());
                }
                if (registrantContact.getZipCode() != null) {
                    jsonWriter.key("ZipCode").value(registrantContact.getZipCode());
                }
                if (registrantContact.getPhoneNumber() != null) {
                    jsonWriter.key("PhoneNumber").value(registrantContact.getPhoneNumber());
                }
                if (registrantContact.getEmail() != null) {
                    jsonWriter.key("Email").value(registrantContact.getEmail());
                }
                if (registrantContact.getFax() != null) {
                    jsonWriter.key("Fax").value(registrantContact.getFax());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam> extraParamsList = (com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam>)(registrantContact.getExtraParams());
                if (extraParamsList != null && !(extraParamsList.isAutoConstruct() && extraParamsList.isEmpty())) {

                    jsonWriter.key("ExtraParams");
                    jsonWriter.array();

                    for (ExtraParam extraParamsListValue : extraParamsList) {
                        if (extraParamsListValue != null) {
                            jsonWriter.object();
                            if (extraParamsListValue.getName() != null) {
                                jsonWriter.key("Name").value(extraParamsListValue.getName());
                            }
                            if (extraParamsListValue.getValue() != null) {
                                jsonWriter.key("Value").value(extraParamsListValue.getValue());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            ContactDetail techContact = registerDomainRequest.getTechContact();
            if (techContact != null) {

                jsonWriter.key("TechContact");
                jsonWriter.object();

                if (techContact.getFirstName() != null) {
                    jsonWriter.key("FirstName").value(techContact.getFirstName());
                }
                if (techContact.getLastName() != null) {
                    jsonWriter.key("LastName").value(techContact.getLastName());
                }
                if (techContact.getContactType() != null) {
                    jsonWriter.key("ContactType").value(techContact.getContactType());
                }
                if (techContact.getOrganizationName() != null) {
                    jsonWriter.key("OrganizationName").value(techContact.getOrganizationName());
                }
                if (techContact.getAddressLine1() != null) {
                    jsonWriter.key("AddressLine1").value(techContact.getAddressLine1());
                }
                if (techContact.getAddressLine2() != null) {
                    jsonWriter.key("AddressLine2").value(techContact.getAddressLine2());
                }
                if (techContact.getCity() != null) {
                    jsonWriter.key("City").value(techContact.getCity());
                }
                if (techContact.getState() != null) {
                    jsonWriter.key("State").value(techContact.getState());
                }
                if (techContact.getCountryCode() != null) {
                    jsonWriter.key("CountryCode").value(techContact.getCountryCode());
                }
                if (techContact.getZipCode() != null) {
                    jsonWriter.key("ZipCode").value(techContact.getZipCode());
                }
                if (techContact.getPhoneNumber() != null) {
                    jsonWriter.key("PhoneNumber").value(techContact.getPhoneNumber());
                }
                if (techContact.getEmail() != null) {
                    jsonWriter.key("Email").value(techContact.getEmail());
                }
                if (techContact.getFax() != null) {
                    jsonWriter.key("Fax").value(techContact.getFax());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam> extraParamsList = (com.amazonaws.internal.ListWithAutoConstructFlag<ExtraParam>)(techContact.getExtraParams());
                if (extraParamsList != null && !(extraParamsList.isAutoConstruct() && extraParamsList.isEmpty())) {

                    jsonWriter.key("ExtraParams");
                    jsonWriter.array();

                    for (ExtraParam extraParamsListValue : extraParamsList) {
                        if (extraParamsListValue != null) {
                            jsonWriter.object();
                            if (extraParamsListValue.getName() != null) {
                                jsonWriter.key("Name").value(extraParamsListValue.getName());
                            }
                            if (extraParamsListValue.getValue() != null) {
                                jsonWriter.key("Value").value(extraParamsListValue.getValue());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            if (registerDomainRequest.isPrivacyProtectAdminContact() != null) {
                jsonWriter.key("PrivacyProtectAdminContact").value(registerDomainRequest.isPrivacyProtectAdminContact());
            }
            if (registerDomainRequest.isPrivacyProtectRegistrantContact() != null) {
                jsonWriter.key("PrivacyProtectRegistrantContact").value(registerDomainRequest.isPrivacyProtectRegistrantContact());
            }
            if (registerDomainRequest.isPrivacyProtectTechContact() != null) {
                jsonWriter.key("PrivacyProtectTechContact").value(registerDomainRequest.isPrivacyProtectTechContact());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
