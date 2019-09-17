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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     */
    private String author;
    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     */
    private String description;
    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     */
    private String homePageUrl;
    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
     * The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     */
    private String licenseBody;
    /**
     * <p>
     * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     * application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     */
    private String licenseUrl;
    /**
     * <p>
     * The name of the application that you want to publish.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     */
    private String name;
    /**
     * <p>
     * A local text readme file in Markdown language that contains a more detailed description of the application and
     * how it works. The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     */
    private String readmeBody;
    /**
     * <p>
     * A link to the S3 object in Markdown language that contains a more detailed description of the application and how
     * it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     */
    private String readmeUrl;
    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     */
    private String sourceCodeArchiveUrl;
    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     */
    private String sourceCodeUrl;
    /**
     * <p>
     * A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     * </p>
     */
    private String spdxLicenseId;
    /**
     * <p>
     * The local raw packaged AWS SAM template file of your application. The file has the format
     * file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * A link to the S3 object containing the packaged AWS SAM template of your application.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     */
    private String templateUrl;

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     * 
     * @param author
     *        The name of the author publishing the app.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127.
     *        </p>
     *        <p>
     *        Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     * 
     * @return The name of the author publishing the app.</p>
     *         <p>
     *         Minimum length=1. Maximum length=127.
     *         </p>
     *         <p>
     *         Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     * 
     * @param author
     *        The name of the author publishing the app.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127.
     *        </p>
     *        <p>
     *        Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     * 
     * @param description
     *        The description of the application.</p>
     *        <p>
     *        Minimum length=1. Maximum length=256
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     * 
     * @return The description of the application.</p>
     *         <p>
     *         Minimum length=1. Maximum length=256
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     * 
     * @param description
     *        The description of the application.</p>
     *        <p>
     *        Minimum length=1. Maximum length=256
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     * 
     * @param homePageUrl
     *        A URL with more information about the application, for example the location of your GitHub repository for
     *        the application.
     */

    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     * 
     * @return A URL with more information about the application, for example the location of your GitHub repository for
     *         the application.
     */

    public String getHomePageUrl() {
        return this.homePageUrl;
    }

    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     * 
     * @param homePageUrl
     *        A URL with more information about the application, for example the location of your GitHub repository for
     *        the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withHomePageUrl(String homePageUrl) {
        setHomePageUrl(homePageUrl);
        return this;
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * 
     * @return Labels to improve discovery of apps in search results.</p>
     *         <p>
     *         Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *         </p>
     *         <p>
     *         Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *        </p>
     *        <p>
     *        Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *        </p>
     *        <p>
     *        Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *        </p>
     *        <p>
     *        Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
     * The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     * 
     * @param licenseBody
     *        A local text file that contains the license of the app that matches the spdxLicenseID value of your
     *        application. The file has the format file://&lt;path>/&lt;filename>.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     */

    public void setLicenseBody(String licenseBody) {
        this.licenseBody = licenseBody;
    }

    /**
     * <p>
     * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
     * The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     * 
     * @return A local text file that contains the license of the app that matches the spdxLicenseID value of your
     *         application. The file has the format file://&lt;path>/&lt;filename>.</p>
     *         <p>
     *         Maximum size 5 MB
     *         </p>
     *         <p>
     *         You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     */

    public String getLicenseBody() {
        return this.licenseBody;
    }

    /**
     * <p>
     * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
     * The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     * 
     * @param licenseBody
     *        A local text file that contains the license of the app that matches the spdxLicenseID value of your
     *        application. The file has the format file://&lt;path>/&lt;filename>.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLicenseBody(String licenseBody) {
        setLicenseBody(licenseBody);
        return this;
    }

    /**
     * <p>
     * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     * application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     * 
     * @param licenseUrl
     *        A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     *        application.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     */

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     * application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     * 
     * @return A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     *         application.</p>
     *         <p>
     *         Maximum size 5 MB
     *         </p>
     *         <p>
     *         You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     */

    public String getLicenseUrl() {
        return this.licenseUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     * application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * </p>
     * 
     * @param licenseUrl
     *        A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your
     *        application.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of licenseBody and licenseUrl; otherwise, an error results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLicenseUrl(String licenseUrl) {
        setLicenseUrl(licenseUrl);
        return this;
    }

    /**
     * <p>
     * The name of the application that you want to publish.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     * 
     * @param name
     *        The name of the application that you want to publish.</p>
     *        <p>
     *        Minimum length=1. Maximum length=140
     *        </p>
     *        <p>
     *        Pattern: "[a-zA-Z0-9\\-]+";
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application that you want to publish.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     * 
     * @return The name of the application that you want to publish.</p>
     *         <p>
     *         Minimum length=1. Maximum length=140
     *         </p>
     *         <p>
     *         Pattern: "[a-zA-Z0-9\\-]+";
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application that you want to publish.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     * 
     * @param name
     *        The name of the application that you want to publish.</p>
     *        <p>
     *        Minimum length=1. Maximum length=140
     *        </p>
     *        <p>
     *        Pattern: "[a-zA-Z0-9\\-]+";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A local text readme file in Markdown language that contains a more detailed description of the application and
     * how it works. The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     * 
     * @param readmeBody
     *        A local text readme file in Markdown language that contains a more detailed description of the application
     *        and how it works. The file has the format file://&lt;path>/&lt;filename>.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     */

    public void setReadmeBody(String readmeBody) {
        this.readmeBody = readmeBody;
    }

    /**
     * <p>
     * A local text readme file in Markdown language that contains a more detailed description of the application and
     * how it works. The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     * 
     * @return A local text readme file in Markdown language that contains a more detailed description of the
     *         application and how it works. The file has the format file://&lt;path>/&lt;filename>.</p>
     *         <p>
     *         Maximum size 5 MB
     *         </p>
     *         <p>
     *         You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     */

    public String getReadmeBody() {
        return this.readmeBody;
    }

    /**
     * <p>
     * A local text readme file in Markdown language that contains a more detailed description of the application and
     * how it works. The file has the format file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     * 
     * @param readmeBody
     *        A local text readme file in Markdown language that contains a more detailed description of the application
     *        and how it works. The file has the format file://&lt;path>/&lt;filename>.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withReadmeBody(String readmeBody) {
        setReadmeBody(readmeBody);
        return this;
    }

    /**
     * <p>
     * A link to the S3 object in Markdown language that contains a more detailed description of the application and how
     * it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     * 
     * @param readmeUrl
     *        A link to the S3 object in Markdown language that contains a more detailed description of the application
     *        and how it works.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     */

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    /**
     * <p>
     * A link to the S3 object in Markdown language that contains a more detailed description of the application and how
     * it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     * 
     * @return A link to the S3 object in Markdown language that contains a more detailed description of the application
     *         and how it works.</p>
     *         <p>
     *         Maximum size 5 MB
     *         </p>
     *         <p>
     *         You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     */

    public String getReadmeUrl() {
        return this.readmeUrl;
    }

    /**
     * <p>
     * A link to the S3 object in Markdown language that contains a more detailed description of the application and how
     * it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * <p>
     * You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * </p>
     * 
     * @param readmeUrl
     *        A link to the S3 object in Markdown language that contains a more detailed description of the application
     *        and how it works.</p>
     *        <p>
     *        Maximum size 5 MB
     *        </p>
     *        <p>
     *        You can specify only one of readmeBody and readmeUrl; otherwise, an error results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withReadmeUrl(String readmeUrl) {
        setReadmeUrl(readmeUrl);
        return this;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @return The semantic version of the application:</p>
     *         <p>
     *         <a href="https://semver.org/">https://semver.org/</a>
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @param sourceCodeArchiveUrl
     *        A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *        application.</p>
     *        <p>
     *        Maximum size 50 MB
     */

    public void setSourceCodeArchiveUrl(String sourceCodeArchiveUrl) {
        this.sourceCodeArchiveUrl = sourceCodeArchiveUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @return A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *         application.</p>
     *         <p>
     *         Maximum size 50 MB
     */

    public String getSourceCodeArchiveUrl() {
        return this.sourceCodeArchiveUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @param sourceCodeArchiveUrl
     *        A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *        application.</p>
     *        <p>
     *        Maximum size 50 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSourceCodeArchiveUrl(String sourceCodeArchiveUrl) {
        setSourceCodeArchiveUrl(sourceCodeArchiveUrl);
        return this;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     */

    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @return A link to a public repository for the source code of your application, for example the URL of a specific
     *         GitHub commit.
     */

    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
        return this;
    }

    /**
     * <p>
     * A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     * </p>
     * 
     * @param spdxLicenseId
     *        A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     */

    public void setSpdxLicenseId(String spdxLicenseId) {
        this.spdxLicenseId = spdxLicenseId;
    }

    /**
     * <p>
     * A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     * </p>
     * 
     * @return A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     */

    public String getSpdxLicenseId() {
        return this.spdxLicenseId;
    }

    /**
     * <p>
     * A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     * </p>
     * 
     * @param spdxLicenseId
     *        A valid identifier from <a href="https://spdx.org/licenses/">https://spdx.org/licenses/</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSpdxLicenseId(String spdxLicenseId) {
        setSpdxLicenseId(spdxLicenseId);
        return this;
    }

    /**
     * <p>
     * The local raw packaged AWS SAM template file of your application. The file has the format
     * file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     * 
     * @param templateBody
     *        The local raw packaged AWS SAM template file of your application. The file has the format
     *        file://&lt;path>/&lt;filename>.</p>
     *        <p>
     *        You can specify only one of templateBody and templateUrl; otherwise an error results.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The local raw packaged AWS SAM template file of your application. The file has the format
     * file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     * 
     * @return The local raw packaged AWS SAM template file of your application. The file has the format
     *         file://&lt;path>/&lt;filename>.</p>
     *         <p>
     *         You can specify only one of templateBody and templateUrl; otherwise an error results.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The local raw packaged AWS SAM template file of your application. The file has the format
     * file://&lt;path>/&lt;filename>.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     * 
     * @param templateBody
     *        The local raw packaged AWS SAM template file of your application. The file has the format
     *        file://&lt;path>/&lt;filename>.</p>
     *        <p>
     *        You can specify only one of templateBody and templateUrl; otherwise an error results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * A link to the S3 object containing the packaged AWS SAM template of your application.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     * 
     * @param templateUrl
     *        A link to the S3 object containing the packaged AWS SAM template of your application.</p>
     *        <p>
     *        You can specify only one of templateBody and templateUrl; otherwise an error results.
     */

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * <p>
     * A link to the S3 object containing the packaged AWS SAM template of your application.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     * 
     * @return A link to the S3 object containing the packaged AWS SAM template of your application.</p>
     *         <p>
     *         You can specify only one of templateBody and templateUrl; otherwise an error results.
     */

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * <p>
     * A link to the S3 object containing the packaged AWS SAM template of your application.
     * </p>
     * <p>
     * You can specify only one of templateBody and templateUrl; otherwise an error results.
     * </p>
     * 
     * @param templateUrl
     *        A link to the S3 object containing the packaged AWS SAM template of your application.</p>
     *        <p>
     *        You can specify only one of templateBody and templateUrl; otherwise an error results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTemplateUrl(String templateUrl) {
        setTemplateUrl(templateUrl);
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
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHomePageUrl() != null)
            sb.append("HomePageUrl: ").append(getHomePageUrl()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getLicenseBody() != null)
            sb.append("LicenseBody: ").append(getLicenseBody()).append(",");
        if (getLicenseUrl() != null)
            sb.append("LicenseUrl: ").append(getLicenseUrl()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReadmeBody() != null)
            sb.append("ReadmeBody: ").append(getReadmeBody()).append(",");
        if (getReadmeUrl() != null)
            sb.append("ReadmeUrl: ").append(getReadmeUrl()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getSourceCodeArchiveUrl() != null)
            sb.append("SourceCodeArchiveUrl: ").append(getSourceCodeArchiveUrl()).append(",");
        if (getSourceCodeUrl() != null)
            sb.append("SourceCodeUrl: ").append(getSourceCodeUrl()).append(",");
        if (getSpdxLicenseId() != null)
            sb.append("SpdxLicenseId: ").append(getSpdxLicenseId()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateUrl() != null)
            sb.append("TemplateUrl: ").append(getTemplateUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHomePageUrl() == null ^ this.getHomePageUrl() == null)
            return false;
        if (other.getHomePageUrl() != null && other.getHomePageUrl().equals(this.getHomePageUrl()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getLicenseBody() == null ^ this.getLicenseBody() == null)
            return false;
        if (other.getLicenseBody() != null && other.getLicenseBody().equals(this.getLicenseBody()) == false)
            return false;
        if (other.getLicenseUrl() == null ^ this.getLicenseUrl() == null)
            return false;
        if (other.getLicenseUrl() != null && other.getLicenseUrl().equals(this.getLicenseUrl()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReadmeBody() == null ^ this.getReadmeBody() == null)
            return false;
        if (other.getReadmeBody() != null && other.getReadmeBody().equals(this.getReadmeBody()) == false)
            return false;
        if (other.getReadmeUrl() == null ^ this.getReadmeUrl() == null)
            return false;
        if (other.getReadmeUrl() != null && other.getReadmeUrl().equals(this.getReadmeUrl()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getSourceCodeArchiveUrl() == null ^ this.getSourceCodeArchiveUrl() == null)
            return false;
        if (other.getSourceCodeArchiveUrl() != null && other.getSourceCodeArchiveUrl().equals(this.getSourceCodeArchiveUrl()) == false)
            return false;
        if (other.getSourceCodeUrl() == null ^ this.getSourceCodeUrl() == null)
            return false;
        if (other.getSourceCodeUrl() != null && other.getSourceCodeUrl().equals(this.getSourceCodeUrl()) == false)
            return false;
        if (other.getSpdxLicenseId() == null ^ this.getSpdxLicenseId() == null)
            return false;
        if (other.getSpdxLicenseId() != null && other.getSpdxLicenseId().equals(this.getSpdxLicenseId()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateUrl() == null ^ this.getTemplateUrl() == null)
            return false;
        if (other.getTemplateUrl() != null && other.getTemplateUrl().equals(this.getTemplateUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHomePageUrl() == null) ? 0 : getHomePageUrl().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getLicenseBody() == null) ? 0 : getLicenseBody().hashCode());
        hashCode = prime * hashCode + ((getLicenseUrl() == null) ? 0 : getLicenseUrl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReadmeBody() == null) ? 0 : getReadmeBody().hashCode());
        hashCode = prime * hashCode + ((getReadmeUrl() == null) ? 0 : getReadmeUrl().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeArchiveUrl() == null) ? 0 : getSourceCodeArchiveUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeUrl() == null) ? 0 : getSourceCodeUrl().hashCode());
        hashCode = prime * hashCode + ((getSpdxLicenseId() == null) ? 0 : getSpdxLicenseId().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateUrl() == null) ? 0 : getTemplateUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
