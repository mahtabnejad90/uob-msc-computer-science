# Software Engineering (Part One) - Week 4 - Modular Systems


## Task

Write a post (200-300 words) answering the following questions: 

- What are the advantages of having a modular system broken down into components?
- Are there any disadvantages?
- What trade-offs exist when determining how to divide up a system?

## Answer

### Pros

- Flexibility - Components can be interchangeable if for example an additional feature is to be added to the app. Developer can just re-use existing components and add some code without breaking too many changes.

- Debugging - For bigger applications, this architectural system will be more advantageous as it will aid debugging process be more granular rather than digging into the entire codebase.

- Development - Engineers can work on multiple components without effecting each others changes.

### Cons

- Knowledge sharing - Engineers who work on specific components may not fully understand other parts of the codebase, this itself is time consuming to bring people upto speed. Which is why it's important for documentation to be put in place so that others can learn as well.

- Smaller Applications - This type of architecture may not be necessary for a smaller application which requires less functionality as well as less technology stacks.

- Structure - Code structure becomes too complex and too large. Navigation of codebase may be time consuming if naming and coding conventions and norms are not adhered to.

### Trade-offs

Apart from the complexity of the code base, i think the knowledge sharing aspect of it will be very complex. If a system is layered into large number of components, then it will be very challenging for a newcomer to get a hang of the components and how they connect withe achother. It will be even more complex if there are third party dependencies or other add-ons to your software. I myself can testify that onboarding new joiners takes us at least a couple of months before they are comfortable pushing some serious code to main codebase.