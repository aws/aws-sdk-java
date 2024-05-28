/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * CreateStorageLensGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStorageLensGroupRequestMarshaller implements Marshaller<Request<CreateStorageLensGroupRequest>, CreateStorageLensGroupRequest> {

    public Request<CreateStorageLensGroupRequest> marshall(CreateStorageLensGroupRequest createStorageLensGroupRequest) {

        if (createStorageLensGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateStorageLensGroupRequest> request = new DefaultRequest<CreateStorageLensGroupRequest>(createStorageLensGroupRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (createStorageLensGroupRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(createStorageLensGroupRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/storagelensgroup";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("CreateStorageLensGroupRequest");
            if (createStorageLensGroupRequest != null) {

                {
                    StorageLensGroup storageLensGroup = createStorageLensGroupRequest.getStorageLensGroup();
                    if (storageLensGroup != null) {
                        xmlWriter.startElement("StorageLensGroup");

                        if (storageLensGroup.getName() != null) {
                            xmlWriter.startElement("Name").value(storageLensGroup.getName()).endElement();
                        }

                        {
                            StorageLensGroupFilter filter = storageLensGroup.getFilter();
                            if (filter != null) {
                                xmlWriter.startElement("Filter");

                                java.util.List<String> storageLensGroupFilterMatchAnyPrefixList = filter.getMatchAnyPrefix();
                                if (storageLensGroupFilterMatchAnyPrefixList != null) {
                                    xmlWriter.startElement("MatchAnyPrefix");

                                    for (String storageLensGroupFilterMatchAnyPrefixListValue : storageLensGroupFilterMatchAnyPrefixList) {
                                        xmlWriter.startElement("Prefix");
                                        xmlWriter.value(storageLensGroupFilterMatchAnyPrefixListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                java.util.List<String> storageLensGroupFilterMatchAnySuffixList = filter.getMatchAnySuffix();
                                if (storageLensGroupFilterMatchAnySuffixList != null) {
                                    xmlWriter.startElement("MatchAnySuffix");

                                    for (String storageLensGroupFilterMatchAnySuffixListValue : storageLensGroupFilterMatchAnySuffixList) {
                                        xmlWriter.startElement("Suffix");
                                        xmlWriter.value(storageLensGroupFilterMatchAnySuffixListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                java.util.List<S3Tag> storageLensGroupFilterMatchAnyTagList = filter.getMatchAnyTag();
                                if (storageLensGroupFilterMatchAnyTagList != null) {
                                    xmlWriter.startElement("MatchAnyTag");

                                    for (S3Tag storageLensGroupFilterMatchAnyTagListValue : storageLensGroupFilterMatchAnyTagList) {
                                        xmlWriter.startElement("Tag");

                                        if (storageLensGroupFilterMatchAnyTagListValue.getKey() != null) {
                                            xmlWriter.startElement("Key").value(storageLensGroupFilterMatchAnyTagListValue.getKey()).endElement();
                                        }

                                        if (storageLensGroupFilterMatchAnyTagListValue.getValue() != null) {
                                            xmlWriter.startElement("Value").value(storageLensGroupFilterMatchAnyTagListValue.getValue()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                {
                                    MatchObjectAge matchObjectAge = filter.getMatchObjectAge();
                                    if (matchObjectAge != null) {
                                        xmlWriter.startElement("MatchObjectAge");

                                        if (matchObjectAge.getDaysGreaterThan() != null) {
                                            xmlWriter.startElement("DaysGreaterThan").value(matchObjectAge.getDaysGreaterThan()).endElement();
                                        }

                                        if (matchObjectAge.getDaysLessThan() != null) {
                                            xmlWriter.startElement("DaysLessThan").value(matchObjectAge.getDaysLessThan()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    MatchObjectSize matchObjectSize = filter.getMatchObjectSize();
                                    if (matchObjectSize != null) {
                                        xmlWriter.startElement("MatchObjectSize");

                                        if (matchObjectSize.getBytesGreaterThan() != null) {
                                            xmlWriter.startElement("BytesGreaterThan").value(matchObjectSize.getBytesGreaterThan()).endElement();
                                        }

                                        if (matchObjectSize.getBytesLessThan() != null) {
                                            xmlWriter.startElement("BytesLessThan").value(matchObjectSize.getBytesLessThan()).endElement();
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    StorageLensGroupAndOperator and = filter.getAnd();
                                    if (and != null) {
                                        xmlWriter.startElement("And");

                                        java.util.List<String> storageLensGroupAndOperatorMatchAnyPrefixList = and.getMatchAnyPrefix();
                                        if (storageLensGroupAndOperatorMatchAnyPrefixList != null) {
                                            xmlWriter.startElement("MatchAnyPrefix");

                                            for (String storageLensGroupAndOperatorMatchAnyPrefixListValue : storageLensGroupAndOperatorMatchAnyPrefixList) {
                                                xmlWriter.startElement("Prefix");
                                                xmlWriter.value(storageLensGroupAndOperatorMatchAnyPrefixListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        java.util.List<String> storageLensGroupAndOperatorMatchAnySuffixList = and.getMatchAnySuffix();
                                        if (storageLensGroupAndOperatorMatchAnySuffixList != null) {
                                            xmlWriter.startElement("MatchAnySuffix");

                                            for (String storageLensGroupAndOperatorMatchAnySuffixListValue : storageLensGroupAndOperatorMatchAnySuffixList) {
                                                xmlWriter.startElement("Suffix");
                                                xmlWriter.value(storageLensGroupAndOperatorMatchAnySuffixListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        java.util.List<S3Tag> storageLensGroupAndOperatorMatchAnyTagList = and.getMatchAnyTag();
                                        if (storageLensGroupAndOperatorMatchAnyTagList != null) {
                                            xmlWriter.startElement("MatchAnyTag");

                                            for (S3Tag storageLensGroupAndOperatorMatchAnyTagListValue : storageLensGroupAndOperatorMatchAnyTagList) {
                                                xmlWriter.startElement("Tag");

                                                if (storageLensGroupAndOperatorMatchAnyTagListValue.getKey() != null) {
                                                    xmlWriter.startElement("Key").value(storageLensGroupAndOperatorMatchAnyTagListValue.getKey()).endElement();
                                                }

                                                if (storageLensGroupAndOperatorMatchAnyTagListValue.getValue() != null) {
                                                    xmlWriter.startElement("Value").value(storageLensGroupAndOperatorMatchAnyTagListValue.getValue())
                                                            .endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        {
                                            MatchObjectAge matchObjectAge = and.getMatchObjectAge();
                                            if (matchObjectAge != null) {
                                                xmlWriter.startElement("MatchObjectAge");

                                                if (matchObjectAge.getDaysGreaterThan() != null) {
                                                    xmlWriter.startElement("DaysGreaterThan").value(matchObjectAge.getDaysGreaterThan()).endElement();
                                                }

                                                if (matchObjectAge.getDaysLessThan() != null) {
                                                    xmlWriter.startElement("DaysLessThan").value(matchObjectAge.getDaysLessThan()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }

                                        {
                                            MatchObjectSize matchObjectSize = and.getMatchObjectSize();
                                            if (matchObjectSize != null) {
                                                xmlWriter.startElement("MatchObjectSize");

                                                if (matchObjectSize.getBytesGreaterThan() != null) {
                                                    xmlWriter.startElement("BytesGreaterThan").value(matchObjectSize.getBytesGreaterThan()).endElement();
                                                }

                                                if (matchObjectSize.getBytesLessThan() != null) {
                                                    xmlWriter.startElement("BytesLessThan").value(matchObjectSize.getBytesLessThan()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }

                                {
                                    StorageLensGroupOrOperator or = filter.getOr();
                                    if (or != null) {
                                        xmlWriter.startElement("Or");

                                        java.util.List<String> storageLensGroupOrOperatorMatchAnyPrefixList = or.getMatchAnyPrefix();
                                        if (storageLensGroupOrOperatorMatchAnyPrefixList != null) {
                                            xmlWriter.startElement("MatchAnyPrefix");

                                            for (String storageLensGroupOrOperatorMatchAnyPrefixListValue : storageLensGroupOrOperatorMatchAnyPrefixList) {
                                                xmlWriter.startElement("Prefix");
                                                xmlWriter.value(storageLensGroupOrOperatorMatchAnyPrefixListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        java.util.List<String> storageLensGroupOrOperatorMatchAnySuffixList = or.getMatchAnySuffix();
                                        if (storageLensGroupOrOperatorMatchAnySuffixList != null) {
                                            xmlWriter.startElement("MatchAnySuffix");

                                            for (String storageLensGroupOrOperatorMatchAnySuffixListValue : storageLensGroupOrOperatorMatchAnySuffixList) {
                                                xmlWriter.startElement("Suffix");
                                                xmlWriter.value(storageLensGroupOrOperatorMatchAnySuffixListValue);
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        java.util.List<S3Tag> storageLensGroupOrOperatorMatchAnyTagList = or.getMatchAnyTag();
                                        if (storageLensGroupOrOperatorMatchAnyTagList != null) {
                                            xmlWriter.startElement("MatchAnyTag");

                                            for (S3Tag storageLensGroupOrOperatorMatchAnyTagListValue : storageLensGroupOrOperatorMatchAnyTagList) {
                                                xmlWriter.startElement("Tag");

                                                if (storageLensGroupOrOperatorMatchAnyTagListValue.getKey() != null) {
                                                    xmlWriter.startElement("Key").value(storageLensGroupOrOperatorMatchAnyTagListValue.getKey()).endElement();
                                                }

                                                if (storageLensGroupOrOperatorMatchAnyTagListValue.getValue() != null) {
                                                    xmlWriter.startElement("Value").value(storageLensGroupOrOperatorMatchAnyTagListValue.getValue())
                                                            .endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                            xmlWriter.endElement();
                                        }

                                        {
                                            MatchObjectAge matchObjectAge = or.getMatchObjectAge();
                                            if (matchObjectAge != null) {
                                                xmlWriter.startElement("MatchObjectAge");

                                                if (matchObjectAge.getDaysGreaterThan() != null) {
                                                    xmlWriter.startElement("DaysGreaterThan").value(matchObjectAge.getDaysGreaterThan()).endElement();
                                                }

                                                if (matchObjectAge.getDaysLessThan() != null) {
                                                    xmlWriter.startElement("DaysLessThan").value(matchObjectAge.getDaysLessThan()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }

                                        {
                                            MatchObjectSize matchObjectSize = or.getMatchObjectSize();
                                            if (matchObjectSize != null) {
                                                xmlWriter.startElement("MatchObjectSize");

                                                if (matchObjectSize.getBytesGreaterThan() != null) {
                                                    xmlWriter.startElement("BytesGreaterThan").value(matchObjectSize.getBytesGreaterThan()).endElement();
                                                }

                                                if (matchObjectSize.getBytesLessThan() != null) {
                                                    xmlWriter.startElement("BytesLessThan").value(matchObjectSize.getBytesLessThan()).endElement();
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

                        if (storageLensGroup.getStorageLensGroupArn() != null) {
                            xmlWriter.startElement("StorageLensGroupArn").value(storageLensGroup.getStorageLensGroupArn()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                java.util.List<Tag> createStorageLensGroupRequestTagsList = createStorageLensGroupRequest.getTags();
                if (createStorageLensGroupRequestTagsList != null) {
                    xmlWriter.startElement("Tags");

                    for (Tag createStorageLensGroupRequestTagsListValue : createStorageLensGroupRequestTagsList) {
                        xmlWriter.startElement("Tag");

                        if (createStorageLensGroupRequestTagsListValue.getKey() != null) {
                            xmlWriter.startElement("Key").value(createStorageLensGroupRequestTagsListValue.getKey()).endElement();
                        }

                        if (createStorageLensGroupRequestTagsListValue.getValue() != null) {
                            xmlWriter.startElement("Value").value(createStorageLensGroupRequestTagsListValue.getValue()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }
            }
            xmlWriter.endElement();

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
