<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  The ASF licenses this file to You
  under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.  For additional information regarding
  copyright in this work, please see the NOTICE file in the top level
  directory of this distribution.
-->
<%@ include file="/taglibs.jsp" %>
<%@ page isErrorPage="true" %>
<tiles:insert page="/theme/tiles-simplepage.jsp">
   <tiles:put name="banner"       value="/theme/banner.jsp" />
   <tiles:put name="bannerStatus" value="/theme/bannerStatus.jsp" />
   <tiles:put name="head"         value="/theme/head.jsp" />
   <tiles:put name="styles"       value="/theme/empty.jsp" />
   <tiles:put name="messages"     value="/theme/messages.jsp" />
   <tiles:put name="content"      value="/WEB-INF/jsps/404Body.jsp" />
   <tiles:put name="footer"       value="/theme/footer.jsp" />
</tiles:insert>