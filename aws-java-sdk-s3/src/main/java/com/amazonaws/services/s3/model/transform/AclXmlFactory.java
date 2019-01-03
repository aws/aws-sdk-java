/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.Owner;

/**
 * Factory for creating XML fragments from AccessControlList objects that can be
 * sent to Amazon S3 as part of requests.
 */
public class AclXmlFactory {

    /**
     * Converts the specified AccessControlList object to an XML fragment that
     * can be sent to Amazon S3.
     *
     * @param acl
     *            The AccessControlList to convert to XML.
     *
     * @return an XML representation of the Access Control List object, suitable
     *         to send in a request to Amazon S3.
     */
    public byte[] convertToXmlByteArray(AccessControlList acl) throws SdkClientException {
        Owner owner = acl.getOwner();
        if (owner == null) {
            throw new SdkClientException("Invalid AccessControlList: missing an S3Owner");
        }

        XmlWriter xml = new XmlWriter();
        xml.start("AccessControlPolicy", "xmlns", Constants.XML_NAMESPACE);
        xml.start("Owner");
        if (owner.getId() != null) {
            xml.start("ID").value(owner.getId()).end();
        }
        if (owner.getDisplayName() != null) {
            xml.start("DisplayName").value(owner.getDisplayName()).end();
        }
        xml.end();
        xml.start("AccessControlList");
        for (Grant grant : acl.getGrantsAsList()) {
            xml.start("Grant");
            convertToXml(grant.getGrantee(), xml);
            xml.start("Permission").value(grant.getPermission().toString()).end();
            xml.end();
        }
        xml.end();
        xml.end();

        return xml.getBytes();
    }

    /**
     * Returns an XML fragment representing the specified Grantee.
     *
     * @param grantee
     *            The grantee to convert to an XML representation that can be
     *            sent to Amazon S3 as part of a request.
     * @param xml
     *            The XmlWriter to which to concatenate this node to.
     *
     * @return The given XmlWriter containing the specified grantee.
     *
     * @throws SdkClientException
     *             If the specified grantee type isn't recognized.
     */
    protected XmlWriter convertToXml(Grantee grantee, XmlWriter xml) throws SdkClientException {
        if (grantee instanceof CanonicalGrantee) {
            return convertToXml((CanonicalGrantee)grantee, xml);
        } else if (grantee instanceof EmailAddressGrantee) {
            return convertToXml((EmailAddressGrantee)grantee, xml);
        } else if (grantee instanceof GroupGrantee) {
            return convertToXml((GroupGrantee)grantee, xml);
        } else {
            throw new SdkClientException("Unknown Grantee type: " + grantee.getClass().getName());
        }
    }

    /**
     * Returns an XML fragment representing the specified canonical grantee.
     *
     * @param grantee
     *            The canonical grantee to convert to an XML representation that
     *            can be sent to Amazon S3 as part of request.
     * @param xml
     *            The XmlWriter to which to concatenate this node to.
     *
     * @return The given XmlWriter containing the specified canonical grantee.
     */
    protected XmlWriter convertToXml(CanonicalGrantee grantee, XmlWriter xml) {
        xml.start("Grantee", new String[] {"xmlns:xsi" , "xsi:type"},
                new String[] {"http://www.w3.org/2001/XMLSchema-instance", "CanonicalUser"});
        xml.start("ID").value(grantee.getIdentifier()).end();
        xml.end();

        return xml;
    }

    /**
     * Returns an XML fragment representing the specified email address grantee.
     *
     * @param grantee
     *            The email address grantee to convert to an XML representation
     *            that can be sent to Amazon S3 as part of request.
     * @param xml
     *            The XmlWriter to which to concatenate this node to.
     *
     * @return The given XmlWriter containing the specified email address grantee
     */
    protected XmlWriter convertToXml(EmailAddressGrantee grantee, XmlWriter xml) {
        xml.start("Grantee", new String[] {"xmlns:xsi" , "xsi:type"},
                new String[] {"http://www.w3.org/2001/XMLSchema-instance", "AmazonCustomerByEmail"});
        xml.start("EmailAddress").value(grantee.getIdentifier()).end();
        xml.end();

        return xml;
    }

    /**
     * Returns an XML fragment representing the specified group grantee.
     *
     * @param grantee
     *            The group grantee to convert to an XML representation that can
     *            be sent to Amazon S3 as part of request.
     * @param xml
     *            The XmlWriter to which to concatenate this node to.
     *
     * @return The given XmlWriter containing the specified group grantee.
     */
    protected XmlWriter convertToXml(GroupGrantee grantee, XmlWriter xml) {
        xml.start("Grantee", new String[] {"xmlns:xsi" , "xsi:type"},
                new String[] {"http://www.w3.org/2001/XMLSchema-instance", "Group"});
        xml.start("URI").value(grantee.getIdentifier()).end();
        xml.end();

        return xml;
    }

}
