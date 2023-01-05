/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the current status of an allow list, which indicates whether Amazon Macie can access and
 * use the list's criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AllowListStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowListStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the allow list. If the list's criteria specify a regular expression (regex), this value is
     * typically OK. Amazon Macie can compile the expression.
     * </p>
     * <p>
     * If the list's criteria specify an S3 object, possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OK - Macie can retrieve and parse the contents of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a customer
     * managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions settings for the
     * bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that Macie is
     * allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that the
     * object contains the correct entries. Also ensure that the list's criteria specify the correct bucket and object
     * names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the correct
     * bucket and object names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its storage
     * size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure that each file
     * doesn't exceed any quotas. Then configure list settings in Macie for each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object exists,
     * you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use. Work with your
     * Amazon Web Services administrator to ensure that the list's criteria specify the correct bucket and object names,
     * and you have read access to the bucket and the object. If the object is encrypted, also ensure that it's
     * encrypted with a key that you're allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the object. Wait
     * a few minutes and then try again. A list can also have this status if it's encrypted with a key that Amazon S3
     * and Macie can't access or use.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     * information about an error that occurred when Macie tried to access and use the list's criteria.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The current status of the allow list. If the list's criteria specify a regular expression (regex), this value is
     * typically OK. Amazon Macie can compile the expression.
     * </p>
     * <p>
     * If the list's criteria specify an S3 object, possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OK - Macie can retrieve and parse the contents of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a customer
     * managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions settings for the
     * bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that Macie is
     * allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that the
     * object contains the correct entries. Also ensure that the list's criteria specify the correct bucket and object
     * names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the correct
     * bucket and object names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its storage
     * size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure that each file
     * doesn't exceed any quotas. Then configure list settings in Macie for each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object exists,
     * you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use. Work with your
     * Amazon Web Services administrator to ensure that the list's criteria specify the correct bucket and object names,
     * and you have read access to the bucket and the object. If the object is encrypted, also ensure that it's
     * encrypted with a key that you're allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the object. Wait
     * a few minutes and then try again. A list can also have this status if it's encrypted with a key that Amazon S3
     * and Macie can't access or use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The current status of the allow list. If the list's criteria specify a regular expression (regex), this
     *        value is typically OK. Amazon Macie can compile the expression.</p>
     *        <p>
     *        If the list's criteria specify an S3 object, possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        OK - Macie can retrieve and parse the contents of the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a
     *        customer managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions
     *        settings for the bucket and the object. If the object is encrypted, also ensure that it's encrypted with a
     *        key that Macie is allowed to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that
     *        the object contains the correct entries. Also ensure that the list's criteria specify the correct bucket
     *        and object names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the
     *        correct bucket and object names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its
     *        storage size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure
     *        that each file doesn't exceed any quotas. Then configure list settings in Macie for each file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try
     *        again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object
     *        exists, you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use.
     *        Work with your Amazon Web Services administrator to ensure that the list's criteria specify the correct
     *        bucket and object names, and you have read access to the bucket and the object. If the object is
     *        encrypted, also ensure that it's encrypted with a key that you're allowed to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the
     *        object. Wait a few minutes and then try again. A list can also have this status if it's encrypted with a
     *        key that Amazon S3 and Macie can't access or use.
     *        </p>
     *        </li>
     * @see AllowListStatusCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The current status of the allow list. If the list's criteria specify a regular expression (regex), this value is
     * typically OK. Amazon Macie can compile the expression.
     * </p>
     * <p>
     * If the list's criteria specify an S3 object, possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OK - Macie can retrieve and parse the contents of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a customer
     * managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions settings for the
     * bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that Macie is
     * allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that the
     * object contains the correct entries. Also ensure that the list's criteria specify the correct bucket and object
     * names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the correct
     * bucket and object names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its storage
     * size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure that each file
     * doesn't exceed any quotas. Then configure list settings in Macie for each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object exists,
     * you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use. Work with your
     * Amazon Web Services administrator to ensure that the list's criteria specify the correct bucket and object names,
     * and you have read access to the bucket and the object. If the object is encrypted, also ensure that it's
     * encrypted with a key that you're allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the object. Wait
     * a few minutes and then try again. A list can also have this status if it's encrypted with a key that Amazon S3
     * and Macie can't access or use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the allow list. If the list's criteria specify a regular expression (regex), this
     *         value is typically OK. Amazon Macie can compile the expression.</p>
     *         <p>
     *         If the list's criteria specify an S3 object, possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         OK - Macie can retrieve and parse the contents of the object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a
     *         customer managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions
     *         settings for the bucket and the object. If the object is encrypted, also ensure that it's encrypted with
     *         a key that Macie is allowed to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that
     *         the object contains the correct entries. Also ensure that the list's criteria specify the correct bucket
     *         and object names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the
     *         correct bucket and object names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its
     *         storage size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure
     *         that each file doesn't exceed any quotas. Then configure list settings in Macie for each file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try
     *         again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object
     *         exists, you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use.
     *         Work with your Amazon Web Services administrator to ensure that the list's criteria specify the correct
     *         bucket and object names, and you have read access to the bucket and the object. If the object is
     *         encrypted, also ensure that it's encrypted with a key that you're allowed to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the
     *         object. Wait a few minutes and then try again. A list can also have this status if it's encrypted with a
     *         key that Amazon S3 and Macie can't access or use.
     *         </p>
     *         </li>
     * @see AllowListStatusCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The current status of the allow list. If the list's criteria specify a regular expression (regex), this value is
     * typically OK. Amazon Macie can compile the expression.
     * </p>
     * <p>
     * If the list's criteria specify an S3 object, possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OK - Macie can retrieve and parse the contents of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a customer
     * managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions settings for the
     * bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that Macie is
     * allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that the
     * object contains the correct entries. Also ensure that the list's criteria specify the correct bucket and object
     * names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the correct
     * bucket and object names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its storage
     * size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure that each file
     * doesn't exceed any quotas. Then configure list settings in Macie for each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object exists,
     * you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use. Work with your
     * Amazon Web Services administrator to ensure that the list's criteria specify the correct bucket and object names,
     * and you have read access to the bucket and the object. If the object is encrypted, also ensure that it's
     * encrypted with a key that you're allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the object. Wait
     * a few minutes and then try again. A list can also have this status if it's encrypted with a key that Amazon S3
     * and Macie can't access or use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The current status of the allow list. If the list's criteria specify a regular expression (regex), this
     *        value is typically OK. Amazon Macie can compile the expression.</p>
     *        <p>
     *        If the list's criteria specify an S3 object, possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        OK - Macie can retrieve and parse the contents of the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a
     *        customer managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions
     *        settings for the bucket and the object. If the object is encrypted, also ensure that it's encrypted with a
     *        key that Macie is allowed to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that
     *        the object contains the correct entries. Also ensure that the list's criteria specify the correct bucket
     *        and object names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the
     *        correct bucket and object names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its
     *        storage size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure
     *        that each file doesn't exceed any quotas. Then configure list settings in Macie for each file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try
     *        again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object
     *        exists, you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use.
     *        Work with your Amazon Web Services administrator to ensure that the list's criteria specify the correct
     *        bucket and object names, and you have read access to the bucket and the object. If the object is
     *        encrypted, also ensure that it's encrypted with a key that you're allowed to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the
     *        object. Wait a few minutes and then try again. A list can also have this status if it's encrypted with a
     *        key that Amazon S3 and Macie can't access or use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowListStatusCode
     */

    public AllowListStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The current status of the allow list. If the list's criteria specify a regular expression (regex), this value is
     * typically OK. Amazon Macie can compile the expression.
     * </p>
     * <p>
     * If the list's criteria specify an S3 object, possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * OK - Macie can retrieve and parse the contents of the object.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a customer
     * managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions settings for the
     * bucket and the object. If the object is encrypted, also ensure that it's encrypted with a key that Macie is
     * allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that the
     * object contains the correct entries. Also ensure that the list's criteria specify the correct bucket and object
     * names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the correct
     * bucket and object names.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its storage
     * size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure that each file
     * doesn't exceed any quotas. Then configure list settings in Macie for each file.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try again.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object exists,
     * you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use. Work with your
     * Amazon Web Services administrator to ensure that the list's criteria specify the correct bucket and object names,
     * and you have read access to the bucket and the object. If the object is encrypted, also ensure that it's
     * encrypted with a key that you're allowed to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the object. Wait
     * a few minutes and then try again. A list can also have this status if it's encrypted with a key that Amazon S3
     * and Macie can't access or use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The current status of the allow list. If the list's criteria specify a regular expression (regex), this
     *        value is typically OK. Amazon Macie can compile the expression.</p>
     *        <p>
     *        If the list's criteria specify an S3 object, possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        OK - Macie can retrieve and parse the contents of the object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_ACCESS_DENIED - Macie isn't allowed to access the object or the object is encrypted with a
     *        customer managed KMS key that Macie isn't allowed to use. Check the bucket policy and other permissions
     *        settings for the bucket and the object. If the object is encrypted, also ensure that it's encrypted with a
     *        key that Macie is allowed to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_EMPTY - Macie can retrieve the object but the object doesn't contain any content. Ensure that
     *        the object contains the correct entries. Also ensure that the list's criteria specify the correct bucket
     *        and object names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_NOT_FOUND - The object doesn't exist in Amazon S3. Ensure that the list's criteria specify the
     *        correct bucket and object names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_OBJECT_OVERSIZE - Macie can retrieve the object. However, the object contains too many entries or its
     *        storage size exceeds the quota for an allow list. Try breaking the list into multiple files and ensure
     *        that each file doesn't exceed any quotas. Then configure list settings in Macie for each file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_THROTTLED - Amazon S3 throttled the request to retrieve the object. Wait a few minutes and then try
     *        again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3_USER_ACCESS_DENIED - Amazon S3 denied the request to retrieve the object. If the specified object
     *        exists, you're not allowed to access it or it's encrypted with an KMS key that you're not allowed to use.
     *        Work with your Amazon Web Services administrator to ensure that the list's criteria specify the correct
     *        bucket and object names, and you have read access to the bucket and the object. If the object is
     *        encrypted, also ensure that it's encrypted with a key that you're allowed to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN_ERROR - A transient or internal error occurred when Macie attempted to retrieve or parse the
     *        object. Wait a few minutes and then try again. A list can also have this status if it's encrypted with a
     *        key that Amazon S3 and Macie can't access or use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowListStatusCode
     */

    public AllowListStatus withCode(AllowListStatusCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     * information about an error that occurred when Macie tried to access and use the list's criteria.
     * </p>
     * 
     * @param description
     *        A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     *        information about an error that occurred when Macie tried to access and use the list's criteria.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     * information about an error that occurred when Macie tried to access and use the list's criteria.
     * </p>
     * 
     * @return A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     *         information about an error that occurred when Macie tried to access and use the list's criteria.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     * information about an error that occurred when Macie tried to access and use the list's criteria.
     * </p>
     * 
     * @param description
     *        A brief description of the status of the allow list. Amazon Macie uses this value to provide additional
     *        information about an error that occurred when Macie tried to access and use the list's criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListStatus withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowListStatus == false)
            return false;
        AllowListStatus other = (AllowListStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public AllowListStatus clone() {
        try {
            return (AllowListStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.AllowListStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
