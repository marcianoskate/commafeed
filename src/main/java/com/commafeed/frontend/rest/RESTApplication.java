package com.commafeed.frontend.rest;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.commafeed.frontend.rest.resources.AdminSettingsREST;
import com.commafeed.frontend.rest.resources.AdminUsersREST;
import com.commafeed.frontend.rest.resources.EntriesREST;
import com.commafeed.frontend.rest.resources.SessionREST;
import com.commafeed.frontend.rest.resources.SettingsREST;
import com.commafeed.frontend.rest.resources.SubscriptionsREST;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.common.collect.Sets;
import com.wordnik.swagger.jaxrs.JaxrsApiReader;

@ApplicationPath("/rest")
public class RESTApplication extends Application {
	
	static {
		JaxrsApiReader.setFormatString("");
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = Sets.newHashSet();
		set.add(ApiListingResource.class);
		set.add(JacksonJsonProvider.class);

		set.add(SubscriptionsREST.class);
		set.add(EntriesREST.class);
		set.add(SettingsREST.class);
		set.add(AdminUsersREST.class);
		set.add(AdminSettingsREST.class);
		set.add(SessionREST.class);
		return set;
	}
}
