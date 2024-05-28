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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxChangesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the kdb database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A list of change request objects that are run in order. A change request object consists of
     * <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     * database directory. All database paths must start with a leading / and end with a trailing /. The
     * <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     * <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if it is a
     * file.
     * </p>
     * <p>
     * Here are few examples of how you can use the change request object:
     * </p>
     * <ol>
     * <li>
     * <p>
     * This request adds a single sym file at database root location.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the database.
     * </p>
     * <p>
     * <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request deletes the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the database,
     * and the <i>PUT</i> request adds a new taq table under it.
     * </p>
     * <p>
     * <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * </ol>
     */
    private java.util.List<ChangeRequest> changeRequests;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier of the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     * 
     * @return A unique identifier of the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxChangesetRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the kdb database.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the kdb database.
     * </p>
     * 
     * @return The name of the kdb database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the kdb database.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxChangesetRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A list of change request objects that are run in order. A change request object consists of
     * <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     * database directory. All database paths must start with a leading / and end with a trailing /. The
     * <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     * <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if it is a
     * file.
     * </p>
     * <p>
     * Here are few examples of how you can use the change request object:
     * </p>
     * <ol>
     * <li>
     * <p>
     * This request adds a single sym file at database root location.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the database.
     * </p>
     * <p>
     * <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request deletes the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the database,
     * and the <i>PUT</i> request adds a new taq table under it.
     * </p>
     * <p>
     * <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @return A list of change request objects that are run in order. A change request object consists of
     *         <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the
     *         following values: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT – Adds or updates files in a database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE – Deletes files in a database.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within
     *         the database directory. All database paths must start with a leading / and end with a trailing /. The
     *         <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     *         <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if
     *         it is a file.
     *         </p>
     *         <p>
     *         Here are few examples of how you can use the change request object:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         This request adds a single sym file at database root location.
     *         </p>
     *         <p>
     *         <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     *         </p>
     *         <p>
     *         <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the
     *         database.
     *         </p>
     *         <p>
     *         <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This request deletes the 2020.01.02 partition of the database.
     *         </p>
     *         <p>
     *         <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the
     *         database, and the <i>PUT</i> request adds a new taq table under it.
     *         </p>
     *         <p>
     *         <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *         </p>
     *         </li>
     */

    public java.util.List<ChangeRequest> getChangeRequests() {
        return changeRequests;
    }

    /**
     * <p>
     * A list of change request objects that are run in order. A change request object consists of
     * <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     * database directory. All database paths must start with a leading / and end with a trailing /. The
     * <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     * <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if it is a
     * file.
     * </p>
     * <p>
     * Here are few examples of how you can use the change request object:
     * </p>
     * <ol>
     * <li>
     * <p>
     * This request adds a single sym file at database root location.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the database.
     * </p>
     * <p>
     * <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request deletes the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the database,
     * and the <i>PUT</i> request adds a new taq table under it.
     * </p>
     * <p>
     * <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param changeRequests
     *        A list of change request objects that are run in order. A change request object consists of
     *        <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the
     *        following values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT – Adds or updates files in a database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE – Deletes files in a database.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     *        database directory. All database paths must start with a leading / and end with a trailing /. The
     *        <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     *        <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if
     *        it is a file.
     *        </p>
     *        <p>
     *        Here are few examples of how you can use the change request object:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        This request adds a single sym file at database root location.
     *        </p>
     *        <p>
     *        <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     *        </p>
     *        <p>
     *        <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the
     *        database.
     *        </p>
     *        <p>
     *        <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request deletes the 2020.01.02 partition of the database.
     *        </p>
     *        <p>
     *        <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the
     *        database, and the <i>PUT</i> request adds a new taq table under it.
     *        </p>
     *        <p>
     *        <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *        </p>
     *        </li>
     */

    public void setChangeRequests(java.util.Collection<ChangeRequest> changeRequests) {
        if (changeRequests == null) {
            this.changeRequests = null;
            return;
        }

        this.changeRequests = new java.util.ArrayList<ChangeRequest>(changeRequests);
    }

    /**
     * <p>
     * A list of change request objects that are run in order. A change request object consists of
     * <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     * database directory. All database paths must start with a leading / and end with a trailing /. The
     * <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     * <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if it is a
     * file.
     * </p>
     * <p>
     * Here are few examples of how you can use the change request object:
     * </p>
     * <ol>
     * <li>
     * <p>
     * This request adds a single sym file at database root location.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the database.
     * </p>
     * <p>
     * <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request deletes the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the database,
     * and the <i>PUT</i> request adds a new taq table under it.
     * </p>
     * <p>
     * <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * </ol>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeRequests(java.util.Collection)} or {@link #withChangeRequests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param changeRequests
     *        A list of change request objects that are run in order. A change request object consists of
     *        <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the
     *        following values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT – Adds or updates files in a database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE – Deletes files in a database.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     *        database directory. All database paths must start with a leading / and end with a trailing /. The
     *        <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     *        <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if
     *        it is a file.
     *        </p>
     *        <p>
     *        Here are few examples of how you can use the change request object:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        This request adds a single sym file at database root location.
     *        </p>
     *        <p>
     *        <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     *        </p>
     *        <p>
     *        <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the
     *        database.
     *        </p>
     *        <p>
     *        <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request deletes the 2020.01.02 partition of the database.
     *        </p>
     *        <p>
     *        <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the
     *        database, and the <i>PUT</i> request adds a new taq table under it.
     *        </p>
     *        <p>
     *        <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxChangesetRequest withChangeRequests(ChangeRequest... changeRequests) {
        if (this.changeRequests == null) {
            setChangeRequests(new java.util.ArrayList<ChangeRequest>(changeRequests.length));
        }
        for (ChangeRequest ele : changeRequests) {
            this.changeRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of change request objects that are run in order. A change request object consists of
     * <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT – Adds or updates files in a database.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE – Deletes files in a database.
     * </p>
     * </li>
     * </ul>
     * <p>
     * All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     * database directory. All database paths must start with a leading / and end with a trailing /. The
     * <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     * <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if it is a
     * file.
     * </p>
     * <p>
     * Here are few examples of how you can use the change request object:
     * </p>
     * <ol>
     * <li>
     * <p>
     * This request adds a single sym file at database root location.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the database.
     * </p>
     * <p>
     * <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * This request deletes the 2020.01.02 partition of the database.
     * </p>
     * <p>
     * <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the database,
     * and the <i>PUT</i> request adds a new taq table under it.
     * </p>
     * <p>
     * <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param changeRequests
     *        A list of change request objects that are run in order. A change request object consists of
     *        <code>changeType</code> , <code>s3Path</code>, and <code>dbPath</code>. A changeType can have the
     *        following values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT – Adds or updates files in a database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE – Deletes files in a database.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        All the change requests require a mandatory <code>dbPath</code> attribute that defines the path within the
     *        database directory. All database paths must start with a leading / and end with a trailing /. The
     *        <code>s3Path</code> attribute defines the s3 source file path and is required for a PUT change type. The
     *        <code>s3path</code> must end with a trailing / if it is a directory and must end without a trailing / if
     *        it is a file.
     *        </p>
     *        <p>
     *        Here are few examples of how you can use the change request object:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        This request adds a single sym file at database root location.
     *        </p>
     *        <p>
     *        <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/sym", "dbPath":"/"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request adds files in the given <code>s3Path</code> under the 2020.01.02 partition of the database.
     *        </p>
     *        <p>
     *        <code>{ "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/", "dbPath":"/2020.01.02/"}</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request adds files in the given <code>s3Path</code> under the <i>taq</i> table partition of the
     *        database.
     *        </p>
     *        <p>
     *        <code>[ { "changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This request deletes the 2020.01.02 partition of the database.
     *        </p>
     *        <p>
     *        <code>[{ "changeType": "DELETE", "dbPath": "/2020.01.02/"} ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <i>DELETE</i> request allows you to delete the existing files under the 2020.01.02 partition of the
     *        database, and the <i>PUT</i> request adds a new taq table under it.
     *        </p>
     *        <p>
     *        <code>[ {"changeType": "DELETE", "dbPath":"/2020.01.02/"}, {"changeType": "PUT", "s3Path":"s3://bucket/db/2020.01.02/taq/", "dbPath":"/2020.01.02/taq/"}]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxChangesetRequest withChangeRequests(java.util.Collection<ChangeRequest> changeRequests) {
        setChangeRequests(changeRequests);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxChangesetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getChangeRequests() != null)
            sb.append("ChangeRequests: ").append(getChangeRequests()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKxChangesetRequest == false)
            return false;
        CreateKxChangesetRequest other = (CreateKxChangesetRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getChangeRequests() == null ^ this.getChangeRequests() == null)
            return false;
        if (other.getChangeRequests() != null && other.getChangeRequests().equals(this.getChangeRequests()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getChangeRequests() == null) ? 0 : getChangeRequests().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxChangesetRequest clone() {
        return (CreateKxChangesetRequest) super.clone();
    }

}
