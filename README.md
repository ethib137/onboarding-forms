# Onboarding Form Admin Portlet

A site administration portlet that allows you to use any Liferay form to create a new user in Liferay.

This portlet highlights some really cool features of Liferay as a development platform.

* [Service Builder](https://help.liferay.com/hc/en-us/articles/360033253091-What-is-Service-Builder-) lets you generate your application’s Model, Service, and Persistence layers.
  * In this portlet I'm using it to manage the information around picking a form, mapping the form fields to user properties, and how the user should be created.
* [Model Listeners](https://help.liferay.com/hc/en-us/articles/360029122631-Model-Listeners) let you listen for persistence events of Liferay entities and do something in response.
  * This portlet listens to the `onAfterUpdate` event of a formRecord and creates a user with the information from the form.
* [The Panel App Inteface](https://help.liferay.com/hc/en-us/articles/360028833612-Panel-App-Template) let's you add your Liferay customizations to different admin areas of Liferay's UI.
  * In this case it lets me add my portlet to the Site Administration Menu, right next to Forms.
* [Clay React Components](https://clayui.com/docs/components/multi-select.html) such as the multi select are used as needed in the JSP.
  * JSP's are the default in Liferay, but sometimes a little extra JS sugar can be helpful. Inside a form built with JSP tags I use a react component for a multi select to create a nicer user interaction when adding roles and sites to the future user that will be added.

Developed to run on: `Liferay DXP 7.3`.

Built with [Liferay Workspace](https://help.liferay.com/hc/en-us/articles/360029147471-Liferay-Workspace) and [Blade CLI](https://help.liferay.com/hc/en-us/articles/360029147071-Blade-CLI).

![view](/images/view.png)

![edit](/images/edit.png)

## How to Build and Deploy to Liferay

Follow the steps below to build and deploy or copy the modules from the [releases](../../releases/latest) page to your Liferay's deploy folder.

In order to build or deploy this module you will need to [install Blade CLI](https://help.liferay.com/hc/en-us/articles/360028833852-Installing-Blade-CLI).

### To Build

`$ blade gw build`

You can find the built modules at `modules/{module-name}/build/libs/{module-name}.jar`.

### To Deploy

In `gradle-local.properties` add the following line to point towards the Liferay instance you want to deploy to:
```
liferay.workspace.home.dir=/path/to/liferay/home
```

`$ blade gw deploy`

## Usage

Once deployed, this widget will show up in the site administration menu right below `Forms`. Make sure you already have some forms on your site and then click the blue *+* to add a new onboarding form entry.

Add a name for your onboarding form entry, select a form, and click continue. 

The form will now include all the available fields from the form you selected. You can choose which user attributes you want to map the form fields too.

You can then select any organizations, roles, sites, or user groups you want you new users to have and save your form.

Now when anyone fills out your form, a new user will be created from the contents of the form. 

### Note

* A user will not be created if an email address field is not mapped.
* If a user already exists with the chosen email address a user will not be created.
* If a screen name is selected that does not match the screen name requirements, a screen name will be generated for the user.

## Issues & Questions Welcome