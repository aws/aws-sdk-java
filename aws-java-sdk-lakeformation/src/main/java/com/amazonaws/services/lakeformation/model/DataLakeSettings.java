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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure representing a list of Lake Formation principals designated as data lake administrators and lists of
 * principal permission entries for default create database and default create table permissions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DataLakeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     */
    private java.util.List<DataLakePrincipal> dataLakeAdmins;
    /**
     * <p>
     * Specifies whether access control on newly created database is managed by Lake Formation permissions or
     * exclusively by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createDatabaseDefaultPermissions;
    /**
     * <p>
     * Specifies whether access control on newly created table is managed by Lake Formation permissions or exclusively
     * by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     */
    private java.util.List<PrincipalPermissions> createTableDefaultPermissions;
    /**
     * <p>
     * A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the key you
     * can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2, and 3.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     */
    private java.util.List<String> trustedResourceOwners;
    /**
     * <p>
     * Whether to allow Amazon EMR clusters to access data managed by Lake Formation.
     * </p>
     * <p>
     * If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     * Formation.
     * </p>
     * <p>
     * If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are registered
     * with Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch">(Optional)
     * Allow Data Filtering on Amazon EMR</a>.
     * </p>
     */
    private Boolean allowExternalDataFiltering;
    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data
     * filtering.&gt;
     * </p>
     */
    private java.util.List<DataLakePrincipal> externalDataFilteringAllowList;
    /**
     * <p>
     * Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the
     * user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the temporary
     * security credentials that will be used to call Lake Formation's administrative APIs.
     * </p>
     */
    private java.util.List<String> authorizedSessionTagValueList;

    /**
     * <p>
     * A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * 
     * @return A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     */

    public java.util.List<DataLakePrincipal> getDataLakeAdmins() {
        return dataLakeAdmins;
    }

    /**
     * <p>
     * A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     */

    public void setDataLakeAdmins(java.util.Collection<DataLakePrincipal> dataLakeAdmins) {
        if (dataLakeAdmins == null) {
            this.dataLakeAdmins = null;
            return;
        }

        this.dataLakeAdmins = new java.util.ArrayList<DataLakePrincipal>(dataLakeAdmins);
    }

    /**
     * <p>
     * A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataLakeAdmins(java.util.Collection)} or {@link #withDataLakeAdmins(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withDataLakeAdmins(DataLakePrincipal... dataLakeAdmins) {
        if (this.dataLakeAdmins == null) {
            setDataLakeAdmins(new java.util.ArrayList<DataLakePrincipal>(dataLakeAdmins.length));
        }
        for (DataLakePrincipal ele : dataLakeAdmins) {
            this.dataLakeAdmins.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * </p>
     * 
     * @param dataLakeAdmins
     *        A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withDataLakeAdmins(java.util.Collection<DataLakePrincipal> dataLakeAdmins) {
        setDataLakeAdmins(dataLakeAdmins);
        return this;
    }

    /**
     * <p>
     * Specifies whether access control on newly created database is managed by Lake Formation permissions or
     * exclusively by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * 
     * @return Specifies whether access control on newly created database is managed by Lake Formation permissions or
     *         exclusively by IAM permissions.</p>
     *         <p>
     *         A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *         IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *         "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *         implemented by IAM permissions.
     *         </p>
     *         <p>
     *         The only permitted values are an empty array or an array that contains a single JSON object that grants
     *         ALL to IAM_ALLOWED_PRINCIPALS.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *         Security Settings for Your Data Lake</a>.
     */

    public java.util.List<PrincipalPermissions> getCreateDatabaseDefaultPermissions() {
        return createDatabaseDefaultPermissions;
    }

    /**
     * <p>
     * Specifies whether access control on newly created database is managed by Lake Formation permissions or
     * exclusively by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        Specifies whether access control on newly created database is managed by Lake Formation permissions or
     *        exclusively by IAM permissions.</p>
     *        <p>
     *        A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *        IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *        "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *        implemented by IAM permissions.
     *        </p>
     *        <p>
     *        The only permitted values are an empty array or an array that contains a single JSON object that grants
     *        ALL to IAM_ALLOWED_PRINCIPALS.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *        Security Settings for Your Data Lake</a>.
     */

    public void setCreateDatabaseDefaultPermissions(java.util.Collection<PrincipalPermissions> createDatabaseDefaultPermissions) {
        if (createDatabaseDefaultPermissions == null) {
            this.createDatabaseDefaultPermissions = null;
            return;
        }

        this.createDatabaseDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(createDatabaseDefaultPermissions);
    }

    /**
     * <p>
     * Specifies whether access control on newly created database is managed by Lake Formation permissions or
     * exclusively by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateDatabaseDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateDatabaseDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        Specifies whether access control on newly created database is managed by Lake Formation permissions or
     *        exclusively by IAM permissions.</p>
     *        <p>
     *        A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *        IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *        "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *        implemented by IAM permissions.
     *        </p>
     *        <p>
     *        The only permitted values are an empty array or an array that contains a single JSON object that grants
     *        ALL to IAM_ALLOWED_PRINCIPALS.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *        Security Settings for Your Data Lake</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateDatabaseDefaultPermissions(PrincipalPermissions... createDatabaseDefaultPermissions) {
        if (this.createDatabaseDefaultPermissions == null) {
            setCreateDatabaseDefaultPermissions(new java.util.ArrayList<PrincipalPermissions>(createDatabaseDefaultPermissions.length));
        }
        for (PrincipalPermissions ele : createDatabaseDefaultPermissions) {
            this.createDatabaseDefaultPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether access control on newly created database is managed by Lake Formation permissions or
     * exclusively by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * 
     * @param createDatabaseDefaultPermissions
     *        Specifies whether access control on newly created database is managed by Lake Formation permissions or
     *        exclusively by IAM permissions.</p>
     *        <p>
     *        A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *        IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *        "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *        implemented by IAM permissions.
     *        </p>
     *        <p>
     *        The only permitted values are an empty array or an array that contains a single JSON object that grants
     *        ALL to IAM_ALLOWED_PRINCIPALS.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *        Security Settings for Your Data Lake</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateDatabaseDefaultPermissions(java.util.Collection<PrincipalPermissions> createDatabaseDefaultPermissions) {
        setCreateDatabaseDefaultPermissions(createDatabaseDefaultPermissions);
        return this;
    }

    /**
     * <p>
     * Specifies whether access control on newly created table is managed by Lake Formation permissions or exclusively
     * by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * 
     * @return Specifies whether access control on newly created table is managed by Lake Formation permissions or
     *         exclusively by IAM permissions.</p>
     *         <p>
     *         A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *         IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *         "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *         implemented by IAM permissions.
     *         </p>
     *         <p>
     *         The only permitted values are an empty array or an array that contains a single JSON object that grants
     *         ALL to IAM_ALLOWED_PRINCIPALS.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *         Security Settings for Your Data Lake</a>.
     */

    public java.util.List<PrincipalPermissions> getCreateTableDefaultPermissions() {
        return createTableDefaultPermissions;
    }

    /**
     * <p>
     * Specifies whether access control on newly created table is managed by Lake Formation permissions or exclusively
     * by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        Specifies whether access control on newly created table is managed by Lake Formation permissions or
     *        exclusively by IAM permissions.</p>
     *        <p>
     *        A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *        IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *        "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *        implemented by IAM permissions.
     *        </p>
     *        <p>
     *        The only permitted values are an empty array or an array that contains a single JSON object that grants
     *        ALL to IAM_ALLOWED_PRINCIPALS.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *        Security Settings for Your Data Lake</a>.
     */

    public void setCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        if (createTableDefaultPermissions == null) {
            this.createTableDefaultPermissions = null;
            return;
        }

        this.createTableDefaultPermissions = new java.util.ArrayList<PrincipalPermissions>(createTableDefaultPermissions);
    }

    /**
     * <p>
     * Specifies whether access control on newly created table is managed by Lake Formation permissions or exclusively
     * by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateTableDefaultPermissions(java.util.Collection)} or
     * {@link #withCreateTableDefaultPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        Specifies whether access control on newly created table is managed by Lake Formation permissions or
     *        exclusively by IAM permissions.</p>
     *        <p>
     *        A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *        IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *        "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *        implemented by IAM permissions.
     *        </p>
     *        <p>
     *        The only permitted values are an empty array or an array that contains a single JSON object that grants
     *        ALL to IAM_ALLOWED_PRINCIPALS.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *        Security Settings for Your Data Lake</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateTableDefaultPermissions(PrincipalPermissions... createTableDefaultPermissions) {
        if (this.createTableDefaultPermissions == null) {
            setCreateTableDefaultPermissions(new java.util.ArrayList<PrincipalPermissions>(createTableDefaultPermissions.length));
        }
        for (PrincipalPermissions ele : createTableDefaultPermissions) {
            this.createTableDefaultPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether access control on newly created table is managed by Lake Formation permissions or exclusively
     * by IAM permissions.
     * </p>
     * <p>
     * A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     * IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     * "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by
     * IAM permissions.
     * </p>
     * <p>
     * The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to
     * IAM_ALLOWED_PRINCIPALS.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default Security
     * Settings for Your Data Lake</a>.
     * </p>
     * 
     * @param createTableDefaultPermissions
     *        Specifies whether access control on newly created table is managed by Lake Formation permissions or
     *        exclusively by IAM permissions.</p>
     *        <p>
     *        A null value indicates access control by Lake Formation permissions. A value that assigns ALL to
     *        IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting
     *        "Use only IAM access control," and is for backward compatibility with the Glue permission model
     *        implemented by IAM permissions.
     *        </p>
     *        <p>
     *        The only permitted values are an empty array or an array that contains a single JSON object that grants
     *        ALL to IAM_ALLOWED_PRINCIPALS.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html">Changing the Default
     *        Security Settings for Your Data Lake</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withCreateTableDefaultPermissions(java.util.Collection<PrincipalPermissions> createTableDefaultPermissions) {
        setCreateTableDefaultPermissions(createTableDefaultPermissions);
        return this;
    }

    /**
     * <p>
     * A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the key you
     * can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2, and 3.
     * </p>
     * 
     * @return A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the
     *         key you can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2,
     *         and 3.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the key you
     * can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2, and 3.
     * </p>
     * 
     * @param parameters
     *        A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the
     *        key you can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2,
     *        and 3.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the key you
     * can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2, and 3.
     * </p>
     * 
     * @param parameters
     *        A key-value map that provides an additional configuration on your data lake. CrossAccountVersion is the
     *        key you can configure in the Parameters field. Accepted values for the CrossAccountVersion key are 1, 2,
     *        and 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see DataLakeSettings#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * 
     * @return A list of the resource-owning account IDs that the caller's account can use to share their user access
     *         details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.</p>
     *         <p>
     *         You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *         company.
     */

    public java.util.List<String> getTrustedResourceOwners() {
        return trustedResourceOwners;
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * 
     * @param trustedResourceOwners
     *        A list of the resource-owning account IDs that the caller's account can use to share their user access
     *        details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.</p>
     *        <p>
     *        You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *        company.
     */

    public void setTrustedResourceOwners(java.util.Collection<String> trustedResourceOwners) {
        if (trustedResourceOwners == null) {
            this.trustedResourceOwners = null;
            return;
        }

        this.trustedResourceOwners = new java.util.ArrayList<String>(trustedResourceOwners);
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustedResourceOwners(java.util.Collection)} or
     * {@link #withTrustedResourceOwners(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trustedResourceOwners
     *        A list of the resource-owning account IDs that the caller's account can use to share their user access
     *        details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.</p>
     *        <p>
     *        You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *        company.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withTrustedResourceOwners(String... trustedResourceOwners) {
        if (this.trustedResourceOwners == null) {
            setTrustedResourceOwners(new java.util.ArrayList<String>(trustedResourceOwners.length));
        }
        for (String ele : trustedResourceOwners) {
            this.trustedResourceOwners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the resource-owning account IDs that the caller's account can use to share their user access details
     * (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.
     * </p>
     * <p>
     * You may want to specify this property when you are in a high-trust boundary, such as the same team or company.
     * </p>
     * 
     * @param trustedResourceOwners
     *        A list of the resource-owning account IDs that the caller's account can use to share their user access
     *        details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log.</p>
     *        <p>
     *        You may want to specify this property when you are in a high-trust boundary, such as the same team or
     *        company.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withTrustedResourceOwners(java.util.Collection<String> trustedResourceOwners) {
        setTrustedResourceOwners(trustedResourceOwners);
        return this;
    }

    /**
     * <p>
     * Whether to allow Amazon EMR clusters to access data managed by Lake Formation.
     * </p>
     * <p>
     * If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     * Formation.
     * </p>
     * <p>
     * If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are registered
     * with Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch">(Optional)
     * Allow Data Filtering on Amazon EMR</a>.
     * </p>
     * 
     * @param allowExternalDataFiltering
     *        Whether to allow Amazon EMR clusters to access data managed by Lake Formation. </p>
     *        <p>
     *        If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     *        Formation.
     *        </p>
     *        <p>
     *        If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are
     *        registered with Lake Formation.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch"
     *        >(Optional) Allow Data Filtering on Amazon EMR</a>.
     */

    public void setAllowExternalDataFiltering(Boolean allowExternalDataFiltering) {
        this.allowExternalDataFiltering = allowExternalDataFiltering;
    }

    /**
     * <p>
     * Whether to allow Amazon EMR clusters to access data managed by Lake Formation.
     * </p>
     * <p>
     * If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     * Formation.
     * </p>
     * <p>
     * If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are registered
     * with Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch">(Optional)
     * Allow Data Filtering on Amazon EMR</a>.
     * </p>
     * 
     * @return Whether to allow Amazon EMR clusters to access data managed by Lake Formation. </p>
     *         <p>
     *         If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with
     *         Lake Formation.
     *         </p>
     *         <p>
     *         If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are
     *         registered with Lake Formation.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch"
     *         >(Optional) Allow Data Filtering on Amazon EMR</a>.
     */

    public Boolean getAllowExternalDataFiltering() {
        return this.allowExternalDataFiltering;
    }

    /**
     * <p>
     * Whether to allow Amazon EMR clusters to access data managed by Lake Formation.
     * </p>
     * <p>
     * If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     * Formation.
     * </p>
     * <p>
     * If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are registered
     * with Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch">(Optional)
     * Allow Data Filtering on Amazon EMR</a>.
     * </p>
     * 
     * @param allowExternalDataFiltering
     *        Whether to allow Amazon EMR clusters to access data managed by Lake Formation. </p>
     *        <p>
     *        If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     *        Formation.
     *        </p>
     *        <p>
     *        If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are
     *        registered with Lake Formation.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch"
     *        >(Optional) Allow Data Filtering on Amazon EMR</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withAllowExternalDataFiltering(Boolean allowExternalDataFiltering) {
        setAllowExternalDataFiltering(allowExternalDataFiltering);
        return this;
    }

    /**
     * <p>
     * Whether to allow Amazon EMR clusters to access data managed by Lake Formation.
     * </p>
     * <p>
     * If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake
     * Formation.
     * </p>
     * <p>
     * If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are registered
     * with Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch">(Optional)
     * Allow Data Filtering on Amazon EMR</a>.
     * </p>
     * 
     * @return Whether to allow Amazon EMR clusters to access data managed by Lake Formation. </p>
     *         <p>
     *         If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with
     *         Lake Formation.
     *         </p>
     *         <p>
     *         If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are
     *         registered with Lake Formation.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs-aws.amazon.com/lake-formation/latest/dg/getting-started-setup.html#emr-switch"
     *         >(Optional) Allow Data Filtering on Amazon EMR</a>.
     */

    public Boolean isAllowExternalDataFiltering() {
        return this.allowExternalDataFiltering;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data
     * filtering.&gt;
     * </p>
     * 
     * @return A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform
     *         data filtering.&gt;
     */

    public java.util.List<DataLakePrincipal> getExternalDataFilteringAllowList() {
        return externalDataFilteringAllowList;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data
     * filtering.&gt;
     * </p>
     * 
     * @param externalDataFilteringAllowList
     *        A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform
     *        data filtering.&gt;
     */

    public void setExternalDataFilteringAllowList(java.util.Collection<DataLakePrincipal> externalDataFilteringAllowList) {
        if (externalDataFilteringAllowList == null) {
            this.externalDataFilteringAllowList = null;
            return;
        }

        this.externalDataFilteringAllowList = new java.util.ArrayList<DataLakePrincipal>(externalDataFilteringAllowList);
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data
     * filtering.&gt;
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalDataFilteringAllowList(java.util.Collection)} or
     * {@link #withExternalDataFilteringAllowList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param externalDataFilteringAllowList
     *        A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform
     *        data filtering.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withExternalDataFilteringAllowList(DataLakePrincipal... externalDataFilteringAllowList) {
        if (this.externalDataFilteringAllowList == null) {
            setExternalDataFilteringAllowList(new java.util.ArrayList<DataLakePrincipal>(externalDataFilteringAllowList.length));
        }
        for (DataLakePrincipal ele : externalDataFilteringAllowList) {
            this.externalDataFilteringAllowList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data
     * filtering.&gt;
     * </p>
     * 
     * @param externalDataFilteringAllowList
     *        A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform
     *        data filtering.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withExternalDataFilteringAllowList(java.util.Collection<DataLakePrincipal> externalDataFilteringAllowList) {
        setExternalDataFilteringAllowList(externalDataFilteringAllowList);
        return this;
    }

    /**
     * <p>
     * Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the
     * user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the temporary
     * security credentials that will be used to call Lake Formation's administrative APIs.
     * </p>
     * 
     * @return Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag
     *         the user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example
     *         key = "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag
     *         the temporary security credentials that will be used to call Lake Formation's administrative APIs.
     */

    public java.util.List<String> getAuthorizedSessionTagValueList() {
        return authorizedSessionTagValueList;
    }

    /**
     * <p>
     * Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the
     * user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the temporary
     * security credentials that will be used to call Lake Formation's administrative APIs.
     * </p>
     * 
     * @param authorizedSessionTagValueList
     *        Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag
     *        the user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example
     *        key = "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the
     *        temporary security credentials that will be used to call Lake Formation's administrative APIs.
     */

    public void setAuthorizedSessionTagValueList(java.util.Collection<String> authorizedSessionTagValueList) {
        if (authorizedSessionTagValueList == null) {
            this.authorizedSessionTagValueList = null;
            return;
        }

        this.authorizedSessionTagValueList = new java.util.ArrayList<String>(authorizedSessionTagValueList);
    }

    /**
     * <p>
     * Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the
     * user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the temporary
     * security credentials that will be used to call Lake Formation's administrative APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedSessionTagValueList(java.util.Collection)} or
     * {@link #withAuthorizedSessionTagValueList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authorizedSessionTagValueList
     *        Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag
     *        the user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example
     *        key = "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the
     *        temporary security credentials that will be used to call Lake Formation's administrative APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withAuthorizedSessionTagValueList(String... authorizedSessionTagValueList) {
        if (this.authorizedSessionTagValueList == null) {
            setAuthorizedSessionTagValueList(new java.util.ArrayList<String>(authorizedSessionTagValueList.length));
        }
        for (String ele : authorizedSessionTagValueList) {
            this.authorizedSessionTagValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the
     * user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example key =
     * "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the temporary
     * security credentials that will be used to call Lake Formation's administrative APIs.
     * </p>
     * 
     * @param authorizedSessionTagValueList
     *        Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag
     *        the user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example
     *        key = "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the
     *        temporary security credentials that will be used to call Lake Formation's administrative APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeSettings withAuthorizedSessionTagValueList(java.util.Collection<String> authorizedSessionTagValueList) {
        setAuthorizedSessionTagValueList(authorizedSessionTagValueList);
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
        if (getDataLakeAdmins() != null)
            sb.append("DataLakeAdmins: ").append(getDataLakeAdmins()).append(",");
        if (getCreateDatabaseDefaultPermissions() != null)
            sb.append("CreateDatabaseDefaultPermissions: ").append(getCreateDatabaseDefaultPermissions()).append(",");
        if (getCreateTableDefaultPermissions() != null)
            sb.append("CreateTableDefaultPermissions: ").append(getCreateTableDefaultPermissions()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTrustedResourceOwners() != null)
            sb.append("TrustedResourceOwners: ").append(getTrustedResourceOwners()).append(",");
        if (getAllowExternalDataFiltering() != null)
            sb.append("AllowExternalDataFiltering: ").append(getAllowExternalDataFiltering()).append(",");
        if (getExternalDataFilteringAllowList() != null)
            sb.append("ExternalDataFilteringAllowList: ").append(getExternalDataFilteringAllowList()).append(",");
        if (getAuthorizedSessionTagValueList() != null)
            sb.append("AuthorizedSessionTagValueList: ").append(getAuthorizedSessionTagValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeSettings == false)
            return false;
        DataLakeSettings other = (DataLakeSettings) obj;
        if (other.getDataLakeAdmins() == null ^ this.getDataLakeAdmins() == null)
            return false;
        if (other.getDataLakeAdmins() != null && other.getDataLakeAdmins().equals(this.getDataLakeAdmins()) == false)
            return false;
        if (other.getCreateDatabaseDefaultPermissions() == null ^ this.getCreateDatabaseDefaultPermissions() == null)
            return false;
        if (other.getCreateDatabaseDefaultPermissions() != null
                && other.getCreateDatabaseDefaultPermissions().equals(this.getCreateDatabaseDefaultPermissions()) == false)
            return false;
        if (other.getCreateTableDefaultPermissions() == null ^ this.getCreateTableDefaultPermissions() == null)
            return false;
        if (other.getCreateTableDefaultPermissions() != null
                && other.getCreateTableDefaultPermissions().equals(this.getCreateTableDefaultPermissions()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTrustedResourceOwners() == null ^ this.getTrustedResourceOwners() == null)
            return false;
        if (other.getTrustedResourceOwners() != null && other.getTrustedResourceOwners().equals(this.getTrustedResourceOwners()) == false)
            return false;
        if (other.getAllowExternalDataFiltering() == null ^ this.getAllowExternalDataFiltering() == null)
            return false;
        if (other.getAllowExternalDataFiltering() != null && other.getAllowExternalDataFiltering().equals(this.getAllowExternalDataFiltering()) == false)
            return false;
        if (other.getExternalDataFilteringAllowList() == null ^ this.getExternalDataFilteringAllowList() == null)
            return false;
        if (other.getExternalDataFilteringAllowList() != null
                && other.getExternalDataFilteringAllowList().equals(this.getExternalDataFilteringAllowList()) == false)
            return false;
        if (other.getAuthorizedSessionTagValueList() == null ^ this.getAuthorizedSessionTagValueList() == null)
            return false;
        if (other.getAuthorizedSessionTagValueList() != null
                && other.getAuthorizedSessionTagValueList().equals(this.getAuthorizedSessionTagValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLakeAdmins() == null) ? 0 : getDataLakeAdmins().hashCode());
        hashCode = prime * hashCode + ((getCreateDatabaseDefaultPermissions() == null) ? 0 : getCreateDatabaseDefaultPermissions().hashCode());
        hashCode = prime * hashCode + ((getCreateTableDefaultPermissions() == null) ? 0 : getCreateTableDefaultPermissions().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTrustedResourceOwners() == null) ? 0 : getTrustedResourceOwners().hashCode());
        hashCode = prime * hashCode + ((getAllowExternalDataFiltering() == null) ? 0 : getAllowExternalDataFiltering().hashCode());
        hashCode = prime * hashCode + ((getExternalDataFilteringAllowList() == null) ? 0 : getExternalDataFilteringAllowList().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedSessionTagValueList() == null) ? 0 : getAuthorizedSessionTagValueList().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeSettings clone() {
        try {
            return (DataLakeSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.DataLakeSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
