@Filter 
Feature: Comment Functionality on a Post 

Background: User navigates to Sony search page 
	Given I navigate to "Vuukle Blog" page on URL "https://blog.vuukle.com/vuukle-emote-bar-powerful-audience-engagement-plugin/" 
	Then I should see "Vuukle Blog - Vuukle Emote Bar- The most powerful audience engagement Plugin. Blog" title
	
@AcceptanceTest 
Scenario: Post a comment 
	Given I'm already logged in
	When I enter comment "Vuukle Emote Bar feature is very nice!"
	And I click "Post" button
	Then I see "Your comment is under moderation and will be approved by the site moderator. Thank you for your patience." message
